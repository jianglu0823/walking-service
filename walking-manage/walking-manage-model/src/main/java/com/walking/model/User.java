package com.walking.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jianglu
 * @time 2018年3月1日下午3:11:53
 * @function
 */
public class User implements Serializable {
    Integer id ;
    String userName;
    String password;
    Integer gender;
    String realName;
    String phone;
    
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
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
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
    
    

}
