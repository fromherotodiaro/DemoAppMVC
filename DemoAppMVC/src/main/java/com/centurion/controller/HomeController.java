package com.centurion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.centurion.service.CategoryService;

@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("categories", this.categoryService.getCategories());
		return "index";
	}
}
