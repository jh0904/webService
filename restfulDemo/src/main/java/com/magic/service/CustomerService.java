package com.magic.service;

import com.magic.bean.Customer;

import javax.ws.rs.*;

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


	@Path ("customer")
	@POST
	@Produces("application/x-www-form-urlencoded")
	public String addCustomer(@BeanParam Customer customer){
		System.out.println (customer);
		return "Success   "+customer.toString ();
	}
}
