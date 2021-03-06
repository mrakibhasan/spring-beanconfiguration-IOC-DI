package com.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/singleton/bean/beans.xml");
		
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person");
		///hihihihihihihihihi
		person1.setTaxId(666);
 
		System.out.println(person2);
		//Here, we create two beans and after that we set up person1 bean to some value and print person 2 but still print the person1 value because the singleton
		// in signleton no matter how many beans we created only one instance will be existence in the class.
		//in sigleton one instance of object will exist in the program. means here we set tax id to person and print person but still printing the first person1 value.
		// in prototype every time request to the cotainer new object is created.
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
