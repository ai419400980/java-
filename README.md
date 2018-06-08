# java-blog<br>
自己的第一版个人博客,现在把他公开代码,给新手学习!<br>
然后给大家看下我自己的第二版<h2><a href="https://www.liangzl.com" target="_blank">梁钟霖个人博客</a></h2><br>
这个是我毕业的时候，在自己富裕的直接给自己做的博客，让自己学习进步。<br>
过去一年多，我现在公开下自己的源代码。<br><br>
直接下载配置下就可以使用了。<br>
步骤如下:<br>
1.先跑一下bulid_sql.sql，数据库是mysql ，bulid_sql.sql位置在resources文件夹下<br>
2.配置db.properties<br>
3.在刚刚生成的表里面创建后台的管理员账号。表名是mgr_account（mac_tittle字段为账号，mac_password为密码  密码没有md5加密 直接源码显示）<br>
4.直接jetty或者tomcat跑起来就可以了。<br>
5.网站有做黑名单访问，就是防止别人恶意攻击。需要配置邮件提醒 配置类为EmailUtils.java(这个步骤可以忽略)<br>
6.首页地址/index.html    后台地址是/mgr/getMgr.html  前面自己加上服务器路径<br>
有问题的话请加qq群172816590  里面有几百人志同道合的码友<br>
欢迎大家前来访问<br>
<br>
