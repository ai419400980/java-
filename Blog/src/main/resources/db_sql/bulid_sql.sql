/**
*博客项目Blog 初始化sql语句
*author：   梁钟霖
*time：       2016.11.16
*/
<!-- aticle Start -->
CREATE TABLE `aticle` (
  `at_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '文章-id',
  `at_title` varchar(256) NOT NULL COMMENT '文章-标题',
  `ac_author` varchar(128) NOT NULL COMMENT '文章-作者',
  `at_introduction` text NOT NULL COMMENT '文章-简介',
  `at_content` text NOT NULL COMMENT '文章-内容',
  `at_read_count` bigint(10) NOT NULL COMMENT '文章-阅读量',
  `at_praise_count` bigint(10) NOT NULL COMMENT '文章-点赞量',
  `at_up_index` int(1) NOT NULL DEFAULT '0' COMMENT '文章_首页文章',
  `at_type_id` varchar(64) NOT NULL COMMENT '文章类型表-id',
  `at_creat_time_change` varchar(64) DEFAULT NULL COMMENT '文章-变化类型后的时间',
  `at_memo` varchar(512) DEFAULT NULL COMMENT '文章-备注',
  `at_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '文章-创建时间',
  `at_modify_time` datetime NOT NULL COMMENT '文章-修改时间',
  PRIMARY KEY (`at_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章表';
<!-- aticle End -->

<!-- aticle_comment Start -->
CREATE TABLE `aticle_comment` (
  `ac_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '文章评论-id',
  `ac_aticle_id` bigint(20) NOT NULL COMMENT '文章-id',
  `ac_content` text NOT NULL COMMENT '文章评论-评论内容',
  `ac_status` int(1) NOT NULL DEFAULT '1' COMMENT '文章评论-说说状态 1.正常 0.删除(默认1)',
  `ac_creat_time_change` varchar(64) DEFAULT NULL COMMENT '文章评论-变化类型后的时间',
  `ac_memo` varchar(512) DEFAULT NULL COMMENT '文章评论-备注',
  `ac_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '文章评论-创建时间',
  `ac_modify_time` datetime NOT NULL COMMENT '文章评论-修改时间',
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章评论表';
<!-- aticle_comment End -->

<!-- aticle_type Start -->
CREATE TABLE `aticle_type` (
  `at_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '文章类型-id',
  `at_type` varchar(128) NOT NULL COMMENT '文章类型-类型  1.慢生活 2.学无止境 3.一骑绝尘',
  `at_creat_time_change` varchar(64) DEFAULT NULL COMMENT '文章类型-变化类型后的时间',
  `at_memo` varchar(512) DEFAULT NULL COMMENT '文章类型-备注',
  `at_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '文章类型-创建时间',
  PRIMARY KEY (`at_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章类型表';
<!-- aticle_type End -->

<!-- comment Start -->
CREATE TABLE `comment` (
  `co_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论-id',
  `co_content` text NOT NULL COMMENT '评论-说说内容',
  `co_status` int(1) NOT NULL DEFAULT '1' COMMENT '评论-评论状态 1.正常 0.删除(默认1)',
  `co_creat_time_change` varchar(64) DEFAULT NULL COMMENT '评论-变化类型后的时间',
  `co_memo` varchar(512) DEFAULT NULL COMMENT '说说-备注',
  `co_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '说说-创建时间',
  `co_modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '说说-修改时间',
  PRIMARY KEY (`co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评论表';
<!-- comment End -->

<!-- mood Start -->
CREATE TABLE `mood` (
  `mo_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '说说-id',
  `mo_content` text NOT NULL COMMENT '说说-内容',
  `mo_status` int(1) NOT NULL DEFAULT '1' COMMENT '说说-说说状态 1.正常 0.删除(默认1)',
  `mo_creat_time_change` varchar(64) DEFAULT NULL COMMENT '说说-变化类型后的时间',
  `mo_memo` varchar(512) DEFAULT NULL COMMENT '说说-备注',
  `mo_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '说说-创建时间',
  `mo_modify_time` datetime NOT NULL COMMENT '说说-修改时间',
  PRIMARY KEY (`mo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='说说表';
<!-- mood End -->

<!-- visitors End -->
CREATE TABLE `visitors` (
  `vi_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '访问者记录-id',
  `vi_area` varchar(64) DEFAULT NULL COMMENT '访问者记录-地区',
  `vi_ip` varchar(64) DEFAULT NULL COMMENT '访问者记录-ip',
  `vi_memo` varchar(512) DEFAULT NULL,
  `vi_visit_time` varchar(64) DEFAULT NULL COMMENT '访问者记录-访问的时间',
  `vi_creat_time_change` varchar(128) DEFAULT NULL COMMENT '访问者记录-备注',
  `vi_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '访问者记录-变化类型后的时间',
  PRIMARY KEY (`vi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
<!-- visitors End -->

<!-- visitors_logs End -->
CREATE TABLE `visitors_logs` (
  `vl_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '访问者操作记录-id',
  `vl_area` varchar(64) DEFAULT NULL COMMENT '访问者操作记录-地区',
  `vl_ip` varchar(64) DEFAULT NULL COMMENT '访问者操作记录-ip',
  `vl_target` varchar(256) DEFAULT NULL COMMENT '访问者操作记录-访问目标',
  `vl_operation_content` varchar(256) DEFAULT NULL COMMENT '访问者操作记录-操作内容',
  `vl_memo` varchar(512) DEFAULT NULL COMMENT '访问者操作记录-备注',
  `vl_visit_time` varchar(64) DEFAULT NULL COMMENT '访问者操作记录-访问的时间',
  `vl_creat_time_change` varchar(64) DEFAULT NULL COMMENT '访问者记录-变化类型后的时间',
  `vl_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '访问者操作记录-创建时间',
  PRIMARY KEY (`vl_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
<!-- visitors_logs End -->

CREATE TABLE `mgr_account` (
  `mac_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户-id',
  `mac_tittle` varchar(64) DEFAULT NULL COMMENT '用户-账号',
  `mac_password` varchar(128) DEFAULT NULL COMMENT '用户-密码',
  `mac_nick` varchar(64) DEFAULT NULL COMMENT '用户-昵称',
  `mac_memo` varchar(512) DEFAULT NULL COMMENT '用户-备注',
  `mac_creat_time_change` varchar(128) DEFAULT NULL COMMENT '用户-变化类型后的时间',
  `mac_modify_time` datetime NOT NULL COMMENT '用户-修改时间',
  `mac_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '用户-创建时间',
  PRIMARY KEY (`mac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `mgr_count_everyday` (
  `mce_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '后台每日统计-id',
  `mce_ip_count` bigint(10) NOT NULL COMMENT '后台每日统计-ip总数',
  `mce_ip_for_phone` bigint(10) NOT NULL COMMENT '后台每日统计-手机端ip数',
  `mce_ip_for_pc` bigint(10) NOT NULL COMMENT '后台每日统计-电脑端ip数',
  `mce_operation_count` bigint(10) NOT NULL COMMENT '后台每日统计-操作总数',
  `mce_search_count` bigint(10) NOT NULL COMMENT '后台每日统计-搜索总数',
  `mce_message_count` bigint(10) NOT NULL COMMENT '后台每日统计-留言总数',
  `mce_praise_count` bigint(10) NOT NULL COMMENT '后台每日统计-点赞总数',
  `mce_article_message_count` bigint(10) NOT NULL COMMENT '后台每日统计-文章留言总数',
  `mce_creat_time_change` varchar(64) DEFAULT NULL COMMENT '后台每日统计-变化类型后的时间',
  `mce_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '后台每日统计-创建时间',
  `mce_memo` varchar(512) DEFAULT NULL COMMENT '后台每日统计-备注',
  PRIMARY KEY (`mce_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='后台每日统计表';

CREATE TABLE `mgr_login_logs` (
  `mll_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '登入日志-id',
  `mll_ip` varchar(64) DEFAULT NULL COMMENT '登入日志-ip',
  `mll_account` varchar(128) DEFAULT NULL COMMENT '登入日志-账号',
  `mll_login_status` varchar(128) DEFAULT NULL COMMENT '登入日志登录状态',
  `mll_memo` varchar(512) DEFAULT NULL COMMENT '登入日志-备注',
  `mll_creat_time_change` varchar(64) DEFAULT NULL COMMENT '登入日志-变化类型后的时间',
  `mll_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登入日志-创建时间',
  PRIMARY KEY (`mll_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='登入日志表';


CREATE TABLE `mgr_logs` (
  `ml_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '管理员操作日志-id',
  `mgr_ip` varchar(64) DEFAULT NULL COMMENT '管理员操作日志-ip',
  `ml_name` varchar(128) DEFAULT NULL COMMENT '管理员操作日志-操作者名称',
  `ml_target` varchar(128) DEFAULT NULL COMMENT '访问者操作记录-访问目标',
  `ml_operation_content` varchar(128) DEFAULT NULL COMMENT '访问者操作记录-操作内容',
  `ml_creat_time_change` varchar(64) DEFAULT NULL COMMENT '管理员操作日志--变化类型后的时间',
  `ml_memo` varchar(512) DEFAULT NULL COMMENT '管理员操作日志--备注',
  `ml_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '管理员操作日志-创建时间',
  PRIMARY KEY (`ml_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='管理员操作日志表';

CREATE TABLE `mgr_blacklist` (
  `mb_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '黑名单-id',
  `mb_ip` varchar(128) DEFAULT NULL COMMENT '黑名单-ip',
  `mb_grade` int(1) DEFAULT NULL COMMENT '黑名单-等级',
  `mb_reason` varchar(128) DEFAULT NULL COMMENT '黑名单-原因',
  `mb_memo` varchar(512) DEFAULT NULL,
  `mb_creat_time_change` datetime DEFAULT NULL COMMENT '黑名单-备注',
  `mb_creat_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '黑名单-创建时间',
  PRIMARY KEY (`mb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='黑名单表';

