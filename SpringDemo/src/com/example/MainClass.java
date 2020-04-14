package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configFile = "classpath:applicationContext.xml";
		//Spring Container »ý¼º 
		AbstractApplicationContext context = new GenericXmlApplicationContext(configFile);
		//Spring Container ¿¡¼­ °´Ã¼¸¦ °¡Á®¿È 
		MyInfo myInfo = context.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		context.close();
	}
}
