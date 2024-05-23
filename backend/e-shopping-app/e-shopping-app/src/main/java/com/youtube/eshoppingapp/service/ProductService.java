package com.youtube.eshoppingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.eshoppingapp.entity.Product;
import com.youtube.eshoppingapp.repository.ProductRepository;

//For business logic

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository; 
	
	//For Saving
	public String storeProduct(Product product) {
		productRepository.save(product);
		return "Product store successfully";
	}

	//For Getting/Finding All Product
	public List<Product> findAll(){
		return productRepository.findAll();
	}
}
