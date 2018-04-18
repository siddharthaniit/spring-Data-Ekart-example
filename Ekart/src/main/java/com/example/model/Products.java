package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Products {
	
	@Id
	@GeneratedValue
	private long id;

	@Column(unique = true)
	@NotEmpty(message = "productName mandatory")
	private  String productName;

	@NotEmpty(message = "product_description mandatory")
	private  String product_description;

	@NotNull
	private boolean shippable;

	@NotEmpty(message = "image is mandatory")
	@Length(min = 10, max = 500, message = "length is exceeded")
	private String image;

	private  int discount = 0;

	@NotNull
	private  int quantity;

	@NotNull
	private  int price;

	@NotNull
	private  int in_stock;

	@ManyToOne
	@JoinColumn(name = "categories_id")
	private  Categories category_id;

	@ManyToOne
	@JoinColumn(name = "manufacturers_id")
	private  Manufacturers manufacturers_id;

	@Column(updatable = false)
	private  Date createdAt;

	private  Date updatedAt;

	private  boolean is_active;

	private  String sku;

	@ManyToOne 
	@JoinColumn(name="user_wish_list_id")
	private UserWishList userWishList;
	
	@ManyToOne
	@JoinColumn(name="orderdetails_id")
	private  OrderDetails orderDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public boolean isShippable() {
		return shippable;
	}

	public void setShippable(boolean shippable) {
		this.shippable = shippable;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(int in_stock) {
		this.in_stock = in_stock;
	}

	public Categories getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Categories category_id) {
		this.category_id = category_id;
	}

	public Manufacturers getManufacturers_id() {
		return manufacturers_id;
	}

	public void setManufacturers_id(Manufacturers manufacturers_id) {
		this.manufacturers_id = manufacturers_id;
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

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public UserWishList getUserWishList() {
		return userWishList;
	}

	public void setUserWishList(UserWishList userWishList) {
		this.userWishList = userWishList;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	

}
