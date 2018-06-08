package com.liangzi.blog.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.congfig.WebConfig;
import com.liangzi.blog.dao.VisitorsLogsMapper;
import com.liangzi.blog.dao.VisitorsMapper;
import com.liangzi.blog.model.base.Visitors;
import com.liangzi.blog.model.base.VisitorsExample;
import com.liangzi.blog.model.base.VisitorsLogs;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.utils.EmailUtils;
import com.liangzi.blog.utils.TimesUtil;
import com.liangzi.blog.web.utils.AddressUtils;
import com.liangzi.blog.web.utils.model.IPAddrSina;
import com.liangzi.mgr.blog.dao.MgrLoginLogsMapper;
import com.liangzi.mgr.blog.dao.MgrLogsMapper;
import com.liangzi.mgr.blog.model.base.MgrLoginLogs;
import com.liangzi.mgr.blog.model.base.MgrLogs;

/**
 * <p>Title 		: LogsServiceImpl</p>
 * <p>Description   : 日志ServiceImpl </p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月29日 下午9:05:40
 * @version 		: 1.0
 */

@Service("logsService")
public class LogsServiceImpl implements LogsService {
	
	@Autowired
	private VisitorsLogsMapper visitorsLogsMapper;
	@Autowired
	private VisitorsMapper visitorsMapper;
	@Autowired
	private MgrLoginLogsMapper mgrLoginLogsMapper;
	@Autowired
	private MgrLogsMapper mgrLogsMapper;
	@Autowired
	private ThreadPoolTaskExecutor mgrBlackThreadPool;
	@Autowired
	private ThreadPoolTaskExecutor visiterLogsThreadPool;
	/**
	 * 添加用户访问记录及访问目标
	 * @param IP
	 * @param target
	 */
	public void insertVisitLogs(String IP, String target , String operationType ,int check) {
		visiterLogsThreadPool.execute(new Runnable() {
			public void run() {
				VisitorsExample visitorsExample = new VisitorsExample();
				VisitorsExample.Criteria criteria = visitorsExample.createCriteria();
				// 获取当天的日期
				String nowTime = TimesUtil.getNow();
				criteria.andViIpEqualTo(IP);
				criteria.andViVisitTimeEqualTo(nowTime);
				List<Visitors> listVisitor = visitorsMapper.selectByExample(visitorsExample);
				IPAddrSina iPAddrSina = AddressUtils.getIPAddrFromSina(IP);
				String area=null;
				if(iPAddrSina != null){
					area = iPAddrSina.getCountry() + "-" + iPAddrSina.getProvince() + "-" + iPAddrSina.getCity();
				}else{
					area=WebConfig.DEFAULT_IP;
				}
				String type =null;
				if (check == 1) {
					type = BlogConfig.PC;
				}else{
					type = BlogConfig.PHONE;
				}
				// 如果没有查询到记录，说明这个是第一天访问的。要记录
				if(listVisitor.size() == 0){
					Visitors visitors = new Visitors();
					visitors.setViIp(IP);
					visitors.setViArea(area);
					visitors.setViVisitTime(nowTime);
					visitors.setViCreatTime(new Date());
					visitors.setViMemo(type);
					visitorsMapper.insert(visitors);
				}
				VisitorsLogs visitorsLogs = new VisitorsLogs();
				visitorsLogs.setVlArea(area);
				visitorsLogs.setVlIp(IP);
				visitorsLogs.setVlOperationContent(operationType);
				visitorsLogs.setVlTarget(target);
				visitorsLogs.setVlVisitTime(nowTime);
				visitorsLogs.setVlCreatTime(new Date());
				visitorsLogs.setVlMemo(type);
				visitorsLogsMapper.insert(visitorsLogs);
			}
		});
	}
	
	/**
	 * 插入登入信息
	 * @param IP
	 * @param username
	 */
	public void insertMgrLoginLogs(String IP ,String username ,String mllLoginStatus ,String type){
		MgrLoginLogs mrLoginLogs = new MgrLoginLogs();
		mrLoginLogs.setMllIp(IP);
		mrLoginLogs.setMllAccount(username);
		mrLoginLogs.setMllLoginStatus(mllLoginStatus);
		mrLoginLogs.setMllCreatTime(new Date());
		mrLoginLogs.setMllMemo(type);
		mgrLoginLogsMapper.insert(mrLoginLogs);
	}
	
	/**
	 * 后台操作信息
	 * @param IP
	 * @param mlName
	 * @param mlTarget
	 * @param mlOperationContent
	 */
	public void insertMgrLogs(String IP ,String mlName ,String mlTarget ,String mlOperationContent ,String type){
		MgrLogs mgrLogs = new MgrLogs();
		mgrLogs.setMgrIp(IP);
		mgrLogs.setMlName(mlName);
		mgrLogs.setMlTarget(mlTarget);
		mgrLogs.setMlOperationContent(mlOperationContent);
		mgrLogs.setMlMemo(type);
		mgrLogs.setMlCreatTime(new Date());
		mgrLogsMapper.insert(mgrLogs);
	}

	/**
	 * 发送邮件
	 * @param context
	 * @param ip
	 */
	public  void sendEmail(String context, String ip){
		mgrBlackThreadPool.execute(new Runnable() {
			public void run() {
				EmailUtils.sendEmail(context, ip);
			}
		});
	}
}
