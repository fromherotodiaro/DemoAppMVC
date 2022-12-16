package com.centurion.repository.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.centurion.pojos.Category;
import com.centurion.repository.CategoryRepository;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
	@Autowired
	private LocalSessionFactoryBean sessionFactory;

	@Override
	@Transactional
	public List<Category> getCategories() {
		Session s = sessionFactory.getObject().getCurrentSession();
		Query q = s.createQuery("From Category");
		return q.getResultList();
	}

}
