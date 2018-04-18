package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class UserWishList {
    @Id
    @GeneratedValue
	private long id;
    
    @OneToOne()
    @JoinColumn(name = "user_id_fk",unique=true)
	private Users userModel;
    
    @OneToMany(mappedBy = "userWishList")
	private List<Products> products;
    
	private Date createdAt;
	private Date updatedAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Users getUserModel() {
		return userModel;
	}
	public void setUserModel(Users userModel) {
		this.userModel = userModel;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
	
}
