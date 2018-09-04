package com.magic.service;

import com.magic.bean.Customer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * com.magic.service
 *
 * @author jh
 * @date 2018/9/4 8:37
 * description:
 */
@Path ("/crm")
public class CustomerService {

	@Path ("customer/{id}")
	@GET
	@Produces("application/json")
	public Customer getCustomerById(@PathParam ("id") String id){
		//按道理来说去数据库查询
		return new Customer(id,"zhangsan",33);
	}
}
