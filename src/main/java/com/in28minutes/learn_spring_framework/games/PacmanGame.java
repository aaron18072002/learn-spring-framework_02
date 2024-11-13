package com.in28minutes.learn_spring_framework.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GameConsole {
	@Override
	public String toString() {
		return "Pacman Game";
	}
	
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Go up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Go down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go right");
	}
}
