package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Categories {
	
	@Id
	@GeneratedValue
	private long id;
	@NotEmpty(message = "please enter a name")
	@Column(unique=true)
	private String name;
	private String description;
	private int active;
	private String image;
	private Date createdAt;
	private Date updatedAt;
	@OneToMany
	private List<Manufacturers> manufacturers;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public List<Manufacturers> getManufacturers() {
		return manufacturers;
	}
	public void setManufacturers(List<Manufacturers> manufacturers) {
		this.manufacturers = manufacturers;
	}
	
	
	

}
