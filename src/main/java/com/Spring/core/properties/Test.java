package com.Spring.core.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/Spring/core/properties/Propertiesconfig.xml");
			CountriesAndLanguage cal = (CountriesAndLanguage) ctx.getBean("country");
			System.out.println(cal);
		}
	
}
