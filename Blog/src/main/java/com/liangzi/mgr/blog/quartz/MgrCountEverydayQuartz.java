package com.liangzi.mgr.blog.quartz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.liangzi.blog.utils.TimesUtil;
import com.liangzi.mgr.blog.dao.MgrCountEverydayMapper;
import com.liangzi.mgr.blog.model.base.MgrCountEveryday;
import com.liangzi.mgr.blog.service.LoginService;

/**
 * <p>Title			: MgrCountEverydayQuartz</p>
 * <p>Description	: 每日日志Quartz</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzl
 * @date			: 2016年12月19日 上午10:37:52
 * @version			: 1.0
 */
public class MgrCountEverydayQuartz {
	
	@Autowired
	private MgrCountEverydayMapper mgrCountEverydayMapper;
	@Autowired
	private LoginService loginService;
	
	/**
	 * 定时器 控制每日日志
	 */
	public void insertIntomgrCountEveryday(){
		String date = TimesUtil.getYesterday();
		MgrCountEveryday mgrCountEveryday= new MgrCountEveryday();
		mgrCountEveryday.setMceIpCount((long) loginService.getVisit(date));
		mgrCountEveryday.setMceIpForPhone((long) loginService.getSearchForPhone(date));
		mgrCountEveryday.setMceIpForPc((long) loginService.getCountForPc(date));
		mgrCountEveryday.setMceOperationCount((long) loginService.getVisitForOperation(date));
		mgrCountEveryday.setMceSearchCount((long) loginService.getSearchCount(date));
		mgrCountEveryday.setMceMessageCount((long) loginService.getMessageCount(date));
		mgrCountEveryday.setMcePraiseCount((long) loginService.getPraiseCount(date));
		mgrCountEveryday.setMceArticleMessageCount((long) loginService.getArticleMessageCount(date));
		mgrCountEveryday.setMceCreatTime(new Date());
		mgrCountEveryday.setMceMemo(date);
		mgrCountEverydayMapper.insert(mgrCountEveryday);
	}
	
	public static void main(String[] args) {
		System.out.println(TimesUtil.getYesterday());
	}
}
