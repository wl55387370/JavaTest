package com.testing.class10;

public class Dog extends Animal{

	public String type="狗";
	
	public void eat() {
		System.out.println("狗啃骨头");
	}
	
	public void watchDoor() {
		System.out.println("狗狗正在看门");
	}
	
	public void watchDoor(String house) {
		System.out.println("狗狗正在"+house+"家看门");
	}
	
}
