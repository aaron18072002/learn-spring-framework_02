package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameConsole;
import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.PacmanGame;

public class App01GamingBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameConsole pacman = new PacmanGame();
		
		GameRunner gameRunner = new GameRunner(pacman);
		gameRunner.run();
	}	
}
