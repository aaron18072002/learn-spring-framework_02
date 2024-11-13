package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.games.GameConsole;
import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.PacmanGame;

@Configuration
public class GamingConsoleConfiguration {
	@Bean
	public GameConsole pacmanGame() {
		GameConsole pacman = new PacmanGame();
		return pacman;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game) {
		GameRunner gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
