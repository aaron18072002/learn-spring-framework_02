package com.in28minutes.learn_spring_framework.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GameConsole game;
	
	public GameRunner(@Qualifier("SuperContraQualifier")GameConsole game) {
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
