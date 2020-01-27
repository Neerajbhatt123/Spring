package com.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/SpringCore/list/listconfig.xml");
		Hospital hospi =(Hospital) apc.getBean("hospi");
		System.out.println("Name :: "+hospi.getName());
		System.out.println("Deptartment ::" +hospi.getDepartment());
		System.out.println("Deptartment ::" +hospi.getDepartment().getClass());
		
	}

}
