package com.Spring.core.SpringPlaceHolderProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/core/SpringPlaceHolderProperties/databaseconfig.xml");
		MyDAO myDao = (MyDAO) context.getBean("myDAO");
		System.out.println(myDao);
	}

}
