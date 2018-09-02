package webservice;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * com.webservice
 *
 * @author jh
 * @date 2018/9/2 10:37
 * description:
 */
public class MainServer {
	public static void main(String[] args) {
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean ();
		//位置
		jaxWsServerFactoryBean.setAddress ("http://localhost:9999/HelloWorld");
		//提供服务
		jaxWsServerFactoryBean.setServiceClass (HelloWorldService.class);
		//创建服务
		Server server = jaxWsServerFactoryBean.create ();
		//开启服务
		server.start ();
		System.out.println ("开张营业！！！");
	}
}
