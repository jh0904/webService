package client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import webservice.HelloWorld;

/**
 * PACKAGE_NAME
 *
 * @author jh
 * @date 2018/9/2 13:46
 * description:实现客户端
 */
public class Mainclient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean ();
		jaxWsProxyFactoryBean.setAddress ("http://localhost:8888/HelloWorld");
		jaxWsProxyFactoryBean.setServiceClass (HelloWorld.class);
		HelloWorld helloWorld = (HelloWorld)jaxWsProxyFactoryBean.create ();
		System.out.println (helloWorld.sayhello ("李宗盛", 67));
	}
}
