package com.in28minutes.learn_spring_framework.games;

public class SuperContraGame implements GameConsole {
	@Override
	public String toString() {
		return "Super Contra Game";
	}
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
	
	@Override
	public void down() {
		System.out.println("Shit down");
	}
	
	@Override
	public void left() {
		System.out.println("Stop");
	}
	
	@Override
	public void right() {
		System.out.println("Shooting");
	}
}
