package com.Spring.InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Spring/InnerBeans/conconfig.xml");
		Employee emp= (Employee) apc.getBean("employee");
		System.out.println(emp);
	}

}
