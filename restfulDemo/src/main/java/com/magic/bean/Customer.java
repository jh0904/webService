package com.magic.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/4 8:34
 * description:
 */
@XmlRootElement
public class Customer {
	private String id;

	private String name;

	private Integer age;

	public Customer(String id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Customer() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
