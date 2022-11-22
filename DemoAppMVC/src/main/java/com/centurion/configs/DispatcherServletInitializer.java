package com.centurion.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { HibernateConfig.class

		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebAplicationContextConfig.class

		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
