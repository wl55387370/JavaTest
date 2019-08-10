package com.testing.class10.inter;

public class InterDog implements InterAnimal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗啃骨头");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗在狗窝里睡觉");
	}

}
