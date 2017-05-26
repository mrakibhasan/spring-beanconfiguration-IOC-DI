package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/beans/beans.xml");
		
		FruitBasket basket = (FruitBasket)context.getBean("basket");
		
		basket.display();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
