package com.testing.class10.inter;

//类不能多继承，但是实现接口的类可以实现多个接口
public class InterCat implements InterAnimal,InterMammals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃猫粮");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("猫在火炉边睡觉");
	}

	@Override
	public void born() {
		// TODO Auto-generated method stub
		System.out.println("猫生宝宝是直接胎儿出生的");
	}

}
