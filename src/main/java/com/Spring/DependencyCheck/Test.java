package com.Spring.DependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/Spring/DependencyCheck/depconfig.xml");
			
			Perscription per = (Perscription) ctx.getBean("perscription");
			System.out.println(per);
	
		}
}
