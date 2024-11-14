package com.in28minutes.learn_spring_framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learn_spring_framework.games.GameConsole;
import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.PacmanGame;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.games")
public class GamingConsoleConfiguration {
	@Bean
	@Primary
	public GameConsole pacmanGame() {
		GameConsole pacman = new PacmanGame();
		return pacman;
	}
	
	@Bean
	@Autowired
	public GameRunner gameRunner(GameConsole game) {
		GameRunner gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
