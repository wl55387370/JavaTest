package com.testing.class10.inter;

public class TestInter {
	public static void main(String[] args) {
	
		InterAnimal ia=new InterCat();
		ia.eat();
		ia.sleep();
		InterAnimal idog=new InterDog();
		idog.eat();
		idog.sleep();
		Human h =new Human();
		h.feed(idog);
	}
}
