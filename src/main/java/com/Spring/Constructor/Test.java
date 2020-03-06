package com.Spring.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Spring/Constructor/conconfig.xml");
		Employee emp=(com.Spring.Constructor.Employee) apc.getBean("employee");
		System.out.println(emp);
	}

}
