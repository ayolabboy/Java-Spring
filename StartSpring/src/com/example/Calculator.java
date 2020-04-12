package com.example;

public class Calculator {
	public void addAction(int a, int b) {
		System.out.println("Called addAction()");
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
	}

	public void subAction(int a, int b) {
		System.out.println("Called subAction()");
		System.out.printf("%d - %d = %d\n", a, b, (a - b));
	}

	public void multiAction(int a, int b) {
		System.out.println("Called multiAction()");
		System.out.printf("%d x %d = %d\n", a, b, (a * b));
	}

	public void divAction(int a, int b) {
		System.out.println("Called divAction()");
		System.out.printf("%d / %d = %d\n", a, b, (a / b));
	}

}
