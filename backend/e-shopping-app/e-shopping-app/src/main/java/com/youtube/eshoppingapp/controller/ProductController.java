package com.youtube.eshoppingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.eshoppingapp.entity.Product;
import com.youtube.eshoppingapp.service.ProductService;

//To interact  with frontend and backend
@RestController
@RequestMapping("product")
@CrossOrigin 
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	//Method for retrieve 
	//How to call API : http://localhost:8080/product/findAll
	@GetMapping(value = "findAll", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Product> findAllProduct(){
	 return	productservice.findAll();
	}
	
	//How to call API : http://localhost:8080/product/store
	//Method for storing product
	@PostMapping(value="store", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productservice.storeProduct(product);
	}
	
	
}

//CORS: It helps to communicate with frontend and backend ; otherwise face error
