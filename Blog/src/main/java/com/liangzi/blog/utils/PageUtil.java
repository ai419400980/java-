package com.liangzi.blog.utils;

import com.liangzi.blog.congfig.BlogConfig;

/**
 * <p>Title 		: PageUtil</p>
 * <p>Description   : 分页工具类</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月3日 下午8:54:04
 * @version 		: 1.0
 */
public class PageUtil {
	
	/**
	 * 获取总页数
	 * @param maxSize
	 * @return
	 */
	public static int getMaxPage(int maxSize) {
		if (maxSize == 0) {
			return 1;
		}
		if (maxSize % BlogConfig.PAGE_SIZE == 0) {
			maxSize = maxSize / BlogConfig.PAGE_SIZE;
		} else {
			maxSize = maxSize / BlogConfig.PAGE_SIZE + 1;
		}
		return maxSize;
	}
	
	/**
	 * 获取MGR总页数
	 * @param maxSize
	 * @return
	 */
	public static int getMaxPageForMgr(int maxSize) {
		if (maxSize == 0) {
			return 1;
		}
		if (maxSize % BlogConfig.PAGE_SIZE_MGR == 0) {
			maxSize = maxSize / BlogConfig.PAGE_SIZE_MGR;
		} else {
			maxSize = maxSize / BlogConfig.PAGE_SIZE_MGR + 1;
		}
		return maxSize;
	}
}
