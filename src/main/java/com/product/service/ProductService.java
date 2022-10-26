package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.ProductEntity;
import com.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public ProductEntity getProductDetails(Integer pid) {
		
		Optional<ProductEntity> productDetails = productRepository.findById(pid);
		return productDetails.get();
	}

}
