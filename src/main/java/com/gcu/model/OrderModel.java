package com.gcu.model;

public class OrderModel {

	private Long id;
	private String orderNo;
	private String productName;
	private float price;
	private int quantity;
	
	
	public OrderModel() {
		
	}
	public OrderModel(long newId, String newOrder, String newProduct, float newPrice, int newQuantity) {
		this.id = newId;
		this.orderNo = newOrder;
		this.productName = newProduct;
		this.price = newPrice;
		this.quantity = newQuantity;
	}
	public Long getId() {
		return this.id;
	}
	public String getOrderNo() {
		return this.orderNo;
	}
	public String getProductName() {
		return this.productName;
	}
	public float getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setId(Long newId) {
		this.id = newId;
	}
	public void setOrderNo(String newOrderNo) {
		this.orderNo = newOrderNo;
	}
	public void setProductName(String newProductName) {
		this.productName = newProductName;
	}
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}
	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}
	public String toString() {
		return "Id: " + id + " order number: " + orderNo + " product name: " + productName + " price: " + price + " quantity: " + quantity;
	}
}
