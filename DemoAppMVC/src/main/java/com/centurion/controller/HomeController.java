package com.centurion.controller;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private LocalSessionFactoryBean sessionFactory;
	
	@RequestMapping("/")
	@Transactional
	public String index(Model model) {
		Session s = sessionFactory.getObject().getCurrentSession();
		
		Query q = s.createQuery("From Category");
		model.addAttribute("categories", q.getResultList());
		

		
		return "index";
	}
}
