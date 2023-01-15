package com.centurion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centurion.pojos.Product;
import com.centurion.repository.ProductRepository;
import com.centurion.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProducts(String kw) {
		// TODO Auto-generated method stub
		return this.productRepository.getProducts(kw);
	}

}
