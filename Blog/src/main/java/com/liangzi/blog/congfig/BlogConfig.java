package com.liangzi.blog.congfig;

public class BlogConfig {
	
	/** 用户操作 **/
	public final static String OPERATIONTYPE_VISIT 						= "访问";
	public final static String OPERATIONTYPE_VISITFORATICLE 			= "访问文章";
	public final static String OPERATIONTYPE_MESSAGE					= "留言";
	public final static String OPERATIONTYPE_PRAISE						= "点赞文章";
	public final static String OPERATIONTYPE_COMMENT					= "评论文章";
	public final static String OPERATIONTYPE_SEARCH						= "搜索文章";
	public final static String OPERATIONTYPE_CHANGE_ATICLE_COMMENT		= "修改文章评论状态";
	public final static String OPERATIONTYPE_CHANGE_COMMENT				= "修改留言状态";
	public final static String OPERATIONTYPE_CHANGE_MOOD				= "修改心情状态";
	public final static String OPERATIONTYPE_CHANGE_ATCILE				= "修改文章推荐状态";
	public final static String OPERATIONTYPE_CHANGE_ATCILE_DELETE		= "删除文章";
	public final static String OPERATIONTYPE_BLACK_DELETE				= "删除黑名单";
	public final static String OPERATIONTYPE_SQL_INJECTION				= "SQL注入";
	public final static String OPERATIONTYPE_IP_ATCILE_COMMENT			= "刷文章评论";
	public final static String OPERATIONTYPE_IP_COMMENT					= "刷留言板评论";
	public final static String OPERATIONTYPE_IP_BLACK					= "黑名单拦截";
	public final static String OPERATIONTYPE_IP_BLACK_FIRST				= "黑名单初次拦截";
	public final static String OPERATIONTYPE_IP_TWO						= "二级流量攻击";
	public final static String OPERATIONTYPE_IP_ONE						= "一级流量攻击";
	
	/** 用户目標 **/
	public final static String VISIT_INDEX 								= "博客-首页";
	public final static String VISIT_ABOUT 								= "关于我-页面";
	public final static String VISIT_SLOWLIFE 							= "慢生活-页面";
	public final static String VISIT_KNOWLEDGE							= "学无止境-页面";
	public final static String VISIT_SHARE								= "模板分享-页面";
	public final static String VISIT_MOOD								= "心情-页面";
	public final static String VISIT_COMMENT							= "留言表-页面";

	/** 后台管理页面 **/
	public final static String VISIT_IP_DETAIL							= "访问详情-页面";
	public final static String VISIT_IP_OPERATION						= "操作详情-页面";
	public final static String VISIT_IP_LOGIN_LOGS						= "用户登录-页面";
	public final static String VISIT_IP_LOGIN_OPERATION_LOGS			= "登陆操作-页面";
	public final static String VISIT_IP_LOGIN_EVERYDAY_LOGS				= "每日日志-页面";
	public final static String VISIT_IP_LOGIN_BLACKLISTLOGS				= "黑名单-页面";
	public final static String VISIT_IP_LOGIN_ATICLE_COMMENT			= "文章评论-页面";
	public final static String VISIT_IP_LOGIN_COMMENT					= "留言管理-页面";
	public final static String VISIT_IP_LOGIN_MOOD_PAGE					= "心情管理-页面";
	public final static String VISIT_IP_LOGIN_ATICLE_PAGE				= "文章管理-页面";
	public final static String VISIT_IP_LOGIN_ATICLE_COMMENT_OPERATION	= "文章id:";
	public final static String VISIT_IP_LOGIN_COMMENT_OPERATION			= "留言id:";
	public final static String VISIT_IP_LOGIN_ATICLE_OPERATION			= "文章id:";
	public final static String VISIT_IP_LOGIN_MOOD						= "心情id:";
	public final static String VISIT_IP_LOGIN_MOOD_ADD					= "发布心情";
	public final static String VISIT_IP_LOGIN_ATCILE_ADD				= "发布文章";
	public final static String VISIT_IP_LOGIN_ATCILE_UPDATE				= "更新文章";
	
	
	/** 分页属性 **/
	public final static int PAGE_SIZE 									=5;
	public final static int PAGE_SIZE_MGR 								=13;
	
	/** 文章搜索内容 **/
	public final static String SEARCH_NULL								="关键词:";
	
	/** 终端分类 **/
	public final static String PC										="PC端访问";
	public final static String PHONE									="移动端访问";
	
	/** 流量攻击指标 **/
	public final static Integer GRADE_ONE 								=10;
	public final static Integer GRADE_TWO								=20;
	
	/** MGR页面用户炒操作 **/
}
