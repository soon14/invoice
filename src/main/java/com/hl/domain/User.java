package com.hl.domain;

import java.util.List;

public class User {
	//user表内容
	private Integer user_id;      //用户id
	private String user_name;     //用户名字
	private String user_password; //用户密码
	private Integer company_id;   //公司id
	private String  company_name; //公司名字
	private String user_register_time;//用户注册时间
	private String salt;     //盐（密码加密用的）
	private Integer locked;  //是否被上锁
	private List<Group> groups;//用户组
	private List<Permission>permissions;//权限数组
	
	public List<Group> getGroups() {
		return groups;
	}
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getUser_register_time() {
		return user_register_time;
	}
	public void setUser_register_time(String user_register_time) {
		this.user_register_time = user_register_time;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}


	
}
