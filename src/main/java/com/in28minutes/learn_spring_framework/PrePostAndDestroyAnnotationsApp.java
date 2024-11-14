package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class DatabaseLayer {
	public void connect() {
		System.out.println("Connect db");
	}
	
	public void disconnect() {
		System.out.println("Disconnect db");
	}
}

@Component
class BusinessLayer {
	private final DatabaseLayer db;
	
	public BusinessLayer(DatabaseLayer db) {
		this.db = db;
	}
	
	@PostConstruct
	public void connectDb() {
		this.db.connect();
	}
	
	@PreDestroy
	public void disconnectDb() {
		this.db.disconnect();
	}
}

@Configuration
@ComponentScan(basePackages = "com.in28minutes.learn_spring_framework") 
public class PrePostAndDestroyAnnotationsApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext
					(PrePostAndDestroyAnnotationsApp.class);
			
			System.out.println(context.getBeanDefinitionNames());
			
			System.out.println(context.getBean(BusinessLayer.class));
		} finally {
			if(context != null) {
				context.close();
			}
		}
	}
}
