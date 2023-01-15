package com.centurion.service;

import java.util.List;

import com.centurion.pojos.Product;

public interface ProductService {
	List<Product> getProducts(String kw);
}
