package com.spring.reference.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/reference/beans/beans.xml");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		
		jungle.show();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
