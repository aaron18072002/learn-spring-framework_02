package com.in28minutes.learn_spring_framework.games;

public class GameRunner {
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println(this.game.toString() + " started!");
		
		this.game.up();
		this.game.down();
		this.game.right();
		this.game.left();
	}
}
