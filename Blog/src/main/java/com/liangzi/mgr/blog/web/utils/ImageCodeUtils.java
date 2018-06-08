package com.liangzi.mgr.blog.web.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liangzi.blog.congfig.WebConfig;
import com.liangzi.mgr.blog.utils.RandomUtils;


/**
 * <p>Title			: ImageCodeUtils</p>
 * <p>Description	: 图片验证码工具类</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows 10</p>
 * <p>Company		: com.51diaocha</p>
 * @author			: XuJun
 * @date			: 2016年6月24日 上午9:32:22
 * @version			: 1.0
 */
public class ImageCodeUtils  {
	
	/**
	 * 生成图片验证码并写入HttpServletResponse
	 * @param request	 	HttpServletRequest
	 * @param response		HttpServletResponse
	 * @param size			验证码长度
	 * @param key			验证码SessionKey
	 * @param width			验证码宽度
	 * @param height		验证码高度
	 * @param overTime		超时时间
	 */
	public static void getImageCode(HttpServletRequest request, HttpServletResponse response, int size, String key, int width, int height, Integer overTime) {
		String code = RandomUtils.getRandomString(size);
		SessionUtils.set(request, WebConfig.IMAGE_CODE_PREFIX + key, code, overTime); // 设置验证码的Session
		try {
			ImageIO.write(createImages(width, height, code), "jpg", response.getOutputStream()); // 将图片验证码输出
		} catch (IOException e) {
		}
	}
	
	/**
	 * 获取图片验证码
	 * @param width 	宽
	 * @param height 	高
	 * @param code 		验证码
	 * @return 			图片验证码
	 */
	public static BufferedImage createImages(int width, int height, String code) {
		int size = code.length();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics g = image.getGraphics();// 产生Image对象的Graphics对象,改对象可以在图像上进行各种绘制操作
		g.fillRect(0, 0, width, height);
		g.setColor(new Color(245, 244, 208)); // 默认文字颜色
		g.setFont(new Font("Arial", Font.CENTER_BASELINE, 24)); // 设置默认文字大小
		// 画干拢线
		Random random = new Random();
		for (int i = 0; i <= size * 4; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(13);
			int yl = random.nextInt(15);
			g.drawLine(x, y, x + xl, y + yl);
		}
		// 将文字写入图片
		String randomString = code;
		for (int i = 1; i <= size; i++) {
			g.setColor(new Color(random.nextInt(101), random.nextInt(111), random.nextInt(121))); // 设置颜色区间变化
			g.drawString(randomString.charAt(i - 1) + "", 18 * i, 26);
		}
		return image;
	}
	
	/**
	 * 判断验证码是否正确
	 * @param request	 	HttpServletRequest
	 * @param verifyCode 	输入的验证码
	 * @param key			验证码SessionKey
	 * @return 				验证结果
	 */
	public static boolean isVerifyCode(HttpServletRequest request, String verifyCode, String key) {
		if (verifyCode == null  || key == null) {
			return false;
		} else {
			String verify = (String) SessionUtils.get(request, WebConfig.IMAGE_CODE_PREFIX + key);
			if (verify != null) {
				verify = verify.toLowerCase();
				if (verify.equals(verifyCode.toLowerCase())) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

}
