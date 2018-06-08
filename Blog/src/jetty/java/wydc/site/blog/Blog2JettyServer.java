package wydc.site.blog;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
  * <p>Title 		 : QuestionaryJettyServer</p>
  * <p>Description	 : </p>
  * <p>DevelopTools	 : Eclipse_x64_v4.6.1</p>
  * <p>DevelopSystem : win10</p>
  * <p>Company 		 : com.diaocha</p>
  * @author			 : Liangzl
  * @date 			 : 2017年4月14日 下午7:02:28
  * @version 		 : 5.0.0
 */
public class Blog2JettyServer {

	/**
	 * main
	 * @param args 			参数
	 * @throws Exception 	jetty异常
	 */
	public static void main(String[] args) throws Exception {
		new Blog2JettyServer().startJettyServer();
	}

	/**
	 * 启动jetty服务
	 * @throws Exception jetty异常
	 */
	public void startJettyServer() throws Exception {
		System.out.println("Jetty初始化...");
		// 端口
		Integer port = 10016; 
		String contextPath = "";
		// 项目目录
		String resourceBase = "./src/main/webapp";
		Server server = new Server(port);
		WebAppContext webAppContext = new WebAppContext();
		// 项目上下文
		webAppContext.setContextPath(contextPath);
		webAppContext.setResourceBase(resourceBase);
		webAppContext.setDefaultsDescriptor("/webdefault.xml");
		server.setHandler(webAppContext);
		// 指定Spring加载的配置文件名称
		System.setProperty("spring.profiles.default", "dev");
		System.out.println("Jetty启动...");
		server.start();
		String finalResourceBase = webAppContext.getResourceBase();
		String finalCntextPath = webAppContext.getContextPath();
		System.out.println("项目地址:" + finalResourceBase);
		System.out.println("上下文:" + finalCntextPath);
		String projectUrl = "http://127.0.0.1:10016/index.html";
		System.out.println("项目URL: " + projectUrl);
		// 跳转项目URL 页面 (Windows 环境下,调用默认浏览器打开 )
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + projectUrl);
		server.join();
	}
}
