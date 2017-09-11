package org.byn.stickynotes.model;

import org.springframework.stereotype.Component;

//@Component
public class User {

	private String name;
	private String email;
	private String uname;
	private String pwd;
	
	public User() {
	};

	public User(String name, String email, String uname, String pwd) {
		this.name = name;
		this.email = email;
		this.uname = uname;
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
