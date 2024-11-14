package com.in28minutes.learn_spring_framework;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class SingletonClass {
	
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext
					(BeanScopesLauncherApp.class);
			
			System.out.println(context.getBean(SingletonClass.class));
			context.getBean(SingletonClass.class);
			
			context.getBean(PrototypeClass.class);
			context.getBean(PrototypeClass.class);
			context.getBean(PrototypeClass.class);
		} finally {
			if(context != null) {
				context.close();
			}
		}
	}
}
