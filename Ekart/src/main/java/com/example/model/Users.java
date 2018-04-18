package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Users {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@Column(unique = true)
	@Email(message = "Please provide valid email")
	private String email;
	@NotEmpty(message = "password field is mandatory")
	@Length(min = 8, max = 50, message = "password length should be in limit(8 to 15) character's ")
	private String password;
	private String active;
	@OneToOne(mappedBy = "userModel")
	private UserWishList userWishList;
	@OneToMany(mappedBy = "user")
    private List<Orders> list;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public UserWishList getUserWishList() {
		return userWishList;
	}
	public void setUserWishList(UserWishList userWishList) {
		this.userWishList = userWishList;
	}
	public List<Orders> getList() {
		return list;
	}
	public void setList(List<Orders> list) {
		this.list = list;
	} 
    
}
