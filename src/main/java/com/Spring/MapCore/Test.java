package com.Spring.MapCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/Spring/MapCore/Mapconfig.xml");
			Customer cust = (Customer) ctx.getBean("cust");
			System.out.println(cust);
			
			
		}
	
	
}
