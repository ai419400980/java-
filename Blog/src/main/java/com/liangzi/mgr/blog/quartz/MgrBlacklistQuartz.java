package com.liangzi.mgr.blog.quartz;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.liangzi.mgr.blog.dao.MgrBlacklistMapper;
import com.liangzi.mgr.blog.interceptor.MgrBlackInterceptor;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;
import com.liangzi.mgr.blog.model.base.MgrBlacklistExample;

/**
 * <p>Title 		: MgrBlacklistQuartz</p>
 * <p>Description   : 获取黑名单任务</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月28日 下午10:11:50
 * @version 		: 1.0
 */
public class MgrBlacklistQuartz implements InitializingBean{
	
	@Autowired
	private MgrBlacklistMapper blacklistMapper;
	
	/**
	 * 获得黑名单
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		MgrBlackInterceptor.MgrBlacklistMap.clear();
		MgrBlacklistExample blacklistExample = new MgrBlacklistExample();
		MgrBlacklistExample.Criteria criteria = blacklistExample.createCriteria();
		criteria.andMbIdIsNotNull();
		List<MgrBlacklist> MgrBlacklistList = blacklistMapper.selectByExample(blacklistExample);
		if (MgrBlacklistList.size() == 0) {
				
		} else {
			for (MgrBlacklist mgrBlacklist : MgrBlacklistList) {
				MgrBlackInterceptor.MgrBlacklistMap.put(mgrBlacklist.getMbIp(), mgrBlacklist.getMbGrade());
			}
		}
	}
}
