package com.in28minutes.learn_spring_framework;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.beans.Person;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		//1: Launch a Spring context
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Config things that we want Spring manage - @Configuration
		
		var rangaPerson = context.getBean("rangaPerson");
		System.out.println(rangaPerson.toString());
		
		var rangaName = context.getBean("rangaName"); 
		var rangaAge = context.getBean("rangaAge");
		var rangaAddress = context.getBean("rangaAddress");
		
		var copyOfRanga = context.getBean("person");
		System.out.println(copyOfRanga.toString());
		
		List<String> beanNames = List.of(context.getBeanDefinitionNames());
		beanNames.stream().forEach(name -> System.out.println(name));
		
		System.out.println(context.getBean(Person.class));
		
		context.close();
	}
}
