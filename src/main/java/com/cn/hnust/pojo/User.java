package com.cn.hnust.pojo;

/**
 * User Model
 * 
 * @author 	Lian
 * @date	2016年5月16日
 * @since	1.0	
 */
public class User {

	private Integer id;

	private String userName;

	private String password;

	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
