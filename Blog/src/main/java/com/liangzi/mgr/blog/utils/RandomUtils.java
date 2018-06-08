package com.liangzi.mgr.blog.utils;

import java.util.Random;

import com.liangzi.blog.congfig.WebConfig;


/**
 * <p>Title			: RandomUtils</p>
 * <p>Description	: 随机工具类</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows 10</p>
 * <p>Company		: com.51diaocha</p>
 * @author			: XuJun
 * @date			: 2016年6月8日 上午9:19:35
 * @version			: 1.0
 */
public class RandomUtils  {
	
	/**
	 * 获取随机字符串
	 * @param size 	随机字符串长度
	 * @return 		随机字符串
	 */
	public static String getRandomString(int size) {
		return getRandomString(size, WebConfig.STRINGSET_DEFAULT);
	}
	
	/**
	 * 获取随机字符串
	 * @param size 		随机字符串长度
	 * @param stringSet	字符串集合
	 * @return 			随机字符串
	 */
	public static String getRandomString(int size, String stringSet) {
		if(size <= 0 || stringSet == null) {
			return null;
		}
		StringBuffer buffer = new StringBuffer(size);
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			buffer.append(stringSet.charAt(random.nextInt(stringSet.length())));
		}
		return buffer.toString();
	}

}
