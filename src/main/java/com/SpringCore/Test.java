package com.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
			Employee emp = (Employee) ctx.getBean("emp");
			System.out.println("ID ::" + emp.getId());
			System.out.println("Name ::" +emp.getName());
			
		}
	
	
}
