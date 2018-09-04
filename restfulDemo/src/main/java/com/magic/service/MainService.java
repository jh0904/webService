package com.magic.service;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * com.magic.service
 *
 * @author jh
 * @date 2018/9/4 8:42
 * description:
 */
public class MainService {
	public static void main(String[] args) {
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean ();
		jaxrsServerFactoryBean.setAddress ("http://localhost:9999/CustomerService");
		jaxrsServerFactoryBean.setResourceClasses (CustomerService.class);
		jaxrsServerFactoryBean.create ().start ();
		System.out.println ("启动成功");
	}
}
