package com.testing.class10;

public class Cat extends Animal{

	public String type="猫";
	
	public void eat() {
		System.out.println("猫吃猫粮");
	}
	
	public void catchMouse() {
		System.out.println("猫会抓老鼠");
	}
	
	public void superEat() {
		super.eat();
	}
}
