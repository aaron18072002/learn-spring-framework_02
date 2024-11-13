package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.games.GameConsole;
import com.in28minutes.learn_spring_framework.games.GameRunner;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.games")
public class AppGamingLauncherApplication {
//	@Bean
//	public GameConsole pacmanGame() {
//		GameConsole pacman = new PacmanGame();
//		return pacman;
//	}
	
//	@Bean
//	public GameRunner gameRunner(GameConsole game) {
//		GameRunner gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = null;
		try {			
			context = new AnnotationConfigApplicationContext
					(AppGamingLauncherApplication.class);
			
			var gameRunner = context.getBean(GameRunner.class);
			gameRunner.run();
		} finally {
			if(context != null) {			
				context.close();
			}
		}
	}
}
