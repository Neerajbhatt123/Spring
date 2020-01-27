package com.Springcores.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Springcores/Set/setconfig.xml");
		CarDealer card=(CarDealer) apc.getBean("cardealer");
		System.out.println("Name ::" + card.getName());
		System.out.println("Models ::"+card.getModels());
	}

}
