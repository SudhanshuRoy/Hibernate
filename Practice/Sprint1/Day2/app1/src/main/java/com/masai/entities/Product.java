package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
private int ProductId;
private String Productname;
private int price;
private int quantity;
public Product() {
	super();
	
}
public Product(int productId, String productname, int price, int quantity) {
	super();
	ProductId = productId;
	Productname = productname;
	this.price = price;
	this.quantity = quantity;
}
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductname() {
	return Productname;
}
public void setProductname(String productname) {
	Productname = productname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [ProductId=" + ProductId + ", Productname=" + Productname + ", price=" + price + ", quantity="
			+ quantity + "]";
}


}
