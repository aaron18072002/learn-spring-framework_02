package com.in28minutes.learn_spring_framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	
	@Autowired
	public ClassB(ClassA classA) {
		System.out.println("Intialize classB");
		this.classA = classA;
	}
}

@Configuration
public class LazyInitializationLauncherApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext
					(LazyInitializationLauncherApp.class);
			System.out.println(context.getBeanDefinitionNames());
		} finally {
			 if(context != null) {
				 context.close();
			 }
		}
	}
}
