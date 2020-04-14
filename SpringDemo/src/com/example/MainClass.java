package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configFile = "classpath:applicationContext.xml";
		//Spring Container ���� 
		AbstractApplicationContext context = new GenericXmlApplicationContext(configFile);
		//Spring Container ���� ��ü�� ������ 
		MyInfo myInfo = context.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		context.close();
	}
}
