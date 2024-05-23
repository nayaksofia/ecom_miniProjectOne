package com.youtube.eshoppingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private float price;
	
	
//	// Generate non-parameterized constructor
//	
//	public Product() {
//		super();
//	}
//
//	// Generate parameterized constructor
//	public Product(int pid, String pname, float price) {
//		super();
//		this.pid = pid;
//		this.pname = pname;
//		this.price = price;
//	}
	
	// Generate getter and setter

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	// Generate to string method
//
//	@Override
//	public String toString() {
//		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
//	}
//	

}
