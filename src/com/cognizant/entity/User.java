package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -243977712300050823L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String username;
	private String password;
	private String email;
	private String usertype;
	private String mobilenumber;
	private boolean confirmed;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String username, String password, String usertype, String email, String mobilenumber,
			boolean confirmed) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.confirmed = confirmed;
	}
	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", usertype=" + usertype + ", mobilenumber=" + mobilenumber + ", confirmed=" + confirmed + "]";
	}
	
}
