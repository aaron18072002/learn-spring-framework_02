package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.games.GameRunner;

public class App03GamingBasicSpring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = null;
		try {			
			context = new AnnotationConfigApplicationContext
					(GamingConsoleConfiguration.class);
			
			var gameRunner = context.getBean(GameRunner.class);
			gameRunner.run();
		} finally {
			if(context != null) {			
				context.close();
			}
		}
	}
}
