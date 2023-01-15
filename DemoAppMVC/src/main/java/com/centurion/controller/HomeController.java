package com.centurion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.centurion.service.CategoryService;
import com.centurion.service.ProductService;

@Controller
@ControllerAdvice
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@ModelAttribute
	public void commonAtr(Model model) {
		model.addAttribute("categories", this.categoryService.getCategories());
	}
	
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value ="kw", required = false, defaultValue = "") String kw) {
		
		
		model.addAttribute("products", this.productService.getProducts(kw));
		return "index";
	}
	
	@RequestMapping("/cart")
	public String cart(Model model) {
		
	
		return "cart";
	}
}
