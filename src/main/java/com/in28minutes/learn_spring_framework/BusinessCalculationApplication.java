package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.data_services.BusinessCalculationService;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.data_services")
public class BusinessCalculationApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext
					(BusinessCalculationApplication.class);	
			
			var service = context.getBean(BusinessCalculationService.class);
			var max = service.findMax();
			
			System.out.println(max);
		} finally {
			if(context != null) {
				context.close();
			}
		}
	}
}
