package com.liangzi.mgr.blog.quartz;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.service.LogsService;
import com.liangzi.mgr.blog.dao.MgrBlacklistMapper;
import com.liangzi.mgr.blog.interceptor.MgrBlackInterceptor;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;

/**
 * <p>Title 		: MgrCountForIpQuartz</p>
 * <p>Description   : 统计瞬时ip数量Quartz</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月28日 下午11:30:09
 * @version 		: 1.0
 */
public class MgrCountForIpQuartz {
	
	@Autowired
	private MgrBlacklistMapper mgrBlacklistMapper;
	@Autowired
	private LogsService logsService;
	// 瞬时流量统计
	public static Map<String,Integer> IpCountMap = new HashMap<String, Integer>(); 
	
	//统计平均流量，判断是否要加入黑名单
	public void countIp(){
		if (IpCountMap != null ) {
			MgrBlacklist mgrBlacklist = new MgrBlacklist();
			for (Entry<String, Integer> entry : IpCountMap.entrySet()) {  
				if (entry.getValue() >= BlogConfig.GRADE_TWO) {
					if (MgrBlackInterceptor.MgrBlacklistMap.containsKey(entry.getKey())) {
						if (MgrBlackInterceptor.MgrBlacklistMap.get(entry.getKey()) == 1) {
							MgrBlackInterceptor.MgrBlacklistMap.replace(entry.getKey(), 2);
							// 发送邮件
							logsService.sendEmail(BlogConfig.OPERATIONTYPE_IP_TWO, entry.getKey());
							mgrBlacklistMapper.updateByIp(entry.getKey());
						}
					}else{
						MgrBlackInterceptor.MgrBlacklistMap.put(entry.getKey(), 2);
						mgrBlacklist.setMbCreatTime(new Date());
						mgrBlacklist.setMbIp(entry.getKey());
						mgrBlacklist.setMbGrade(2);
						mgrBlacklist.setMbReason(BlogConfig.OPERATIONTYPE_IP_TWO);
						mgrBlacklistMapper.insert(mgrBlacklist);
						// 发送邮件
						logsService.sendEmail(BlogConfig.OPERATIONTYPE_IP_TWO, entry.getKey());
					}
				}else if (entry.getValue() >= BlogConfig.GRADE_ONE) {
					if (MgrBlackInterceptor.MgrBlacklistMap.containsKey(entry.getKey())) {
						
					}else{
						MgrBlackInterceptor.MgrBlacklistMap.put(entry.getKey(), 1);
						mgrBlacklist.setMbCreatTime(new Date());
						mgrBlacklist.setMbIp(entry.getKey());
						mgrBlacklist.setMbGrade(1);
						mgrBlacklist.setMbReason(BlogConfig.OPERATIONTYPE_IP_ONE);
						mgrBlacklistMapper.insert(mgrBlacklist);
						// 发送邮件
						logsService.sendEmail(BlogConfig.OPERATIONTYPE_IP_ONE, entry.getKey());
					}
				}else{
					
				}
			}
			IpCountMap.clear();
		}
	}
}
