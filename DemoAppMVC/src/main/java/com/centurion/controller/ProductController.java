package com.centurion.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.centurion.pojos.Product;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Controller
public class ProductController {
	@Autowired
	private Cloudinary cloudinary;

	@GetMapping("/admin/products")
	public String list(Model model) {

		model.addAttribute("product", new Product());

		return "product";

	}

	@PostMapping("/admin/products")
	public String add(@ModelAttribute(value = "product") @Valid Product product, BindingResult result) {
		if (!result.hasErrors()) {
			try {
				this.cloudinary.uploader().upload(product.getFile().getBytes(), ObjectUtils.asMap("resource_type", "auto"));
				return "redirect:/";
			} catch (IOException e) {
				System.err.print("== ADD PRODUCT ==" + e.getMessage());
			}
		}
		return "product";
	}
}
