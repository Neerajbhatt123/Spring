package com.SpringCore.Cycle.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext apc = new ClassPathXmlApplicationContext("com/SpringCore/Cycle/lc/lcconfig.xml");
		Patient pat = (Patient) apc.getBean("patient");
		System.out.println(pat);
		apc.registerShutdownHook();
		
		
	}

}
