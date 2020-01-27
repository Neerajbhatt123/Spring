package com.SpringCore.Reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/SpringCore/Reftypes/refconfig.xml");
		Students stu = (Students) apc.getBean("students");
		System.out.println(stu);
	}

}
