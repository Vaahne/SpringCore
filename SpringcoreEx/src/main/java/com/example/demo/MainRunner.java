package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		//Using Bean Factory
		BeanFactory app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Using applicationContext
		//ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scooter sc=(Scooter)app.getBean("scooter");
		sc.noOfTyres();
		
		Car car=(Car)app.getBean("car");
		car.noOfTyres();
	} 
}
