package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.games.GameConsole;
import com.in28minutes.learn_spring_framework.games.GameRunner;
import com.in28minutes.learn_spring_framework.games.MarioGame;
import com.in28minutes.learn_spring_framework.games.PacmanGame;
import com.in28minutes.learn_spring_framework.games.SuperContraGame;

public class AppGamingBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameConsole mario = new MarioGame();
		GameConsole superContra = new SuperContraGame();
		GameConsole pacman = new PacmanGame();
		
		System.out.println(mario);
		System.out.println(superContra);
		
		System.out.println("------------");
		
		GameRunner gameRunner = new GameRunner(pacman);
		gameRunner.run();
	}
}
