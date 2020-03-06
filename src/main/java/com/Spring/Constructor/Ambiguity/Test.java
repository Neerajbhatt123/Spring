package com.Spring.Constructor.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.core.properties.CountriesAndLanguage;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/Spring/Constructor/Ambiguity/ambconfig.xml");
		Addition add = (Addition) ctx.getBean("addition");
		System.out.println(add);
	}

}
