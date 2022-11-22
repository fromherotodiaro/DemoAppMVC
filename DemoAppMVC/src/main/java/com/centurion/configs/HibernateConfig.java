package com.centurion.configs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource("classpath:database.properties")
public class HibernateConfig {

	@Autowired
	private Environment env;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setPackagesToScan("com.centurion.pojos");
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("hibernate.connection.driver_class"));
		dataSource.setUrl(env.getProperty("hibernate.connection.url"));
		dataSource.setUsername(env.getProperty("hibernate.connection.username"));
		dataSource.setPassword(env.getProperty("hibernate.connection.password"));
		return dataSource;
	}

	@Bean
	public Properties hibernateProperties() {
		Properties props = new Properties();
		props.setProperty(org.hibernate.cfg.Environment.SHOW_SQL, env.getProperty("hibernate.showSql"));
		props.setProperty(org.hibernate.cfg.Environment.DIALECT, env.getProperty("hibernate.dialect"));
		
		return props;
	}

}
