package com.liangzi.mgr.blog.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.blog.dao.VisitorsLogsMapper;
import com.liangzi.blog.dao.VisitorsMapper;
import com.liangzi.mgr.blog.dao.MgrAccountMapper;
import com.liangzi.mgr.blog.model.base.MgrAccount;
import com.liangzi.mgr.blog.model.base.MgrAccountExample;
import com.liangzi.mgr.blog.service.LoginService;

/**
 * <p>Title 		: LoginService</p>
 * <p>Description   : 博客后台管理登录ServiceImpl</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月8日 下午9:48:30
 * @version 		: 1.0
 */

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private VisitorsLogsMapper visitorsLogsMapper;
	@Autowired
	private VisitorsMapper visitorsMapper;
	@Autowired
	private MgrAccountMapper mgrAccountMapper;
	
	/**
	 * 获取今天访问人数 
	 * @param date
	 * @return
	 */
	public int getVisit(String date){
		Integer countForVisitors = visitorsMapper.getVisitCount(date);
		return countForVisitors;
	}
	
	/**
	 * 获取今天操作人次 
	 * @param date
	 * @return
	 */
	public int getVisitForOperation(String date){
		Integer countForOperation = visitorsLogsMapper.getVisitForOperation(date);
		return countForOperation;
	}
	
	/**
	 * 获取今天搜索次数 
	 * @param date
	 * @return
	 */
	public int getSearchCount(String date){
		Integer countForSearch = visitorsLogsMapper.getSearchCount(date);
		return countForSearch;
	}
	
	/**
	 * 获取今天PC访问IP次数
	 * @param date
	 * @return
	 */
	public int getCountForPc(String date){
		Integer countForVisitorsForPc = visitorsMapper.getVisitCountForWeb(date);
		return countForVisitorsForPc;
	}
	
	/**
	 * 获取今天手机访问IP次数
	 * @param date
	 * @return
	 */
	public int getSearchForPhone(String date){
		Integer countForVisitorsForPhone = visitorsMapper.getVisitCountForPhone(date);
		return countForVisitorsForPhone;
	}
	
	/**
	 * 获取今天留言次数 
	 * @param date
	 * @return
	 */
	public int getMessageCount(String date){
		Integer countForMessage = visitorsLogsMapper.getMessageCount(date);
		return countForMessage;
	}
	
	/**
	 * 获取今天点赞次数 
	 * @param date
	 * @return
	 */
	public int getPraiseCount(String date){
		Integer countForPraise = visitorsLogsMapper.getPraiseCount(date);
		return countForPraise;
	}
	
	/**
	 * 获取今天文章留言次数 
	 * @param date
	 * @return
	 */
	public int getArticleMessageCount(String date){
		Integer countForArticleMessage = visitorsLogsMapper.getArticleMessageCount(date);
		return countForArticleMessage;
	}
	
	/**
	 * 验证账号密码的正确性
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean chenkLogin(String username ,String password ,HttpSession session){
		MgrAccountExample accountExample = new MgrAccountExample();
		MgrAccountExample.Criteria criteria = accountExample.createCriteria();
		criteria.andMacTittleEqualTo(username);
		List<MgrAccount> list = mgrAccountMapper.selectByExample(accountExample);
		if (list.isEmpty()) {
			return false;
		}else{
			if (password.equals(list.get(0).getMacPassword())) {
				session.setAttribute("nick", list.get(0).getMacNick());
				session.setAttribute("id", list.get(0).getMacId());
				session.setAttribute("account", list.get(0).getMacTittle());
				session.setMaxInactiveInterval(1800);
				return true;
			}else{
				return false;
			}
		}
	}
}
