package com.centurion.repository;

import java.util.List;

import com.centurion.pojos.Product;

public interface ProductRepository {
	List<Product> getProducts(String kw);
}
