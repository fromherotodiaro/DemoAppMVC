package com.centurion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centurion.pojos.Category;
import com.centurion.repository.CategoryRepository;
import com.centurion.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getCategories() {
		
		return this.categoryRepository.getCategories();
	}

}
