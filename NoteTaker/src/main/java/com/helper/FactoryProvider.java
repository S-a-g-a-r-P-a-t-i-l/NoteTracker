package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	
	public static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		

			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	
	        return factory;		
	}
	

	
	
	

}
