package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.example.Hello;
import com.example.Printer;

public class HelloBeanTest {
	public static void main(String[] args) { 
		// 1. IoC Container 생성
		ApplicationContext context = new GenericXmlApplicationContext("config/beans.xml");
		
		//2. Hello Beans 가져오기
		Hello hello = (Hello)context.getBean("hello"); 
		System.out.println(hello.sayHello()); 
		hello.print();
		
		//3. SpringPrinter 가져오기 
		Printer printer = (Printer)context.getBean("printer"); 
		System.out.println(printer.toString());
		Hello hello2 = context.getBean("hello", Hello.class);
		//hello2.print();
		System.out.println(hello == hello2); // Singleton Pattern
	}
}