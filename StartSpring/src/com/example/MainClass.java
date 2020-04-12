/*
https://asfirstalways.tistory.com/334
*/
package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configFile = "config/applicationContext.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configFile);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		ctx.close();
	}

}
