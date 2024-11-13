package com.in28minutes.learn_spring_framework.games;

public class MarioGame implements GameConsole {
	@Override
	public String toString() {
		return "Mario Game";
	}
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
	
	@Override
	public void down() {
		System.out.println("Into a hole");
	}
	
	@Override
	public void left() {
		System.out.println("Go back");
	}
	
	@Override
	public void right() {
		System.out.println("Go forward");
	}
}
