package com.testing.class9.parent;
//动物类，人类的父类
public class Animal {

	public int weight=60;
	public int height=180;
	//无参构造方法
//	public Animal() {
//		System.out.println("无参动物出生了");
//	}
	//有参构造方法
	public Animal(String name) {
		System.out.println(name+"动物出生了");
	}
	
	public void eat() {
		System.out.println("动物都会进食");
	}
	
	public void sleep() {
		System.out.println("动物都要睡觉");
	}
	

}
