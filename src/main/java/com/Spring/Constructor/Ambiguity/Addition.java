package com.Spring.Constructor.Ambiguity;

public class Addition {

	Addition() {
		System.out.println("Inside constructor Double");
	}

	Addition(int a, int b) {
		System.out.println("Inside constuctor Integer");
		System.out.println(a + b);
	}
}
