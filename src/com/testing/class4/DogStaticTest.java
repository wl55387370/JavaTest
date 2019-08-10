package com.testing.class4;

public class DogStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DogEye=Dog.showEyes();
		System.out.println(DogEye);
		Dog xiaoBai=new Dog("公");
		xiaoBai.grow(3.5, 12);
		System.out.println(xiaoBai.age);
		xiaoBai.grow();
		System.out.println(xiaoBai.age);
		System.out.println(xiaoBai.gender);
		xiaoBai.bark();
	}

}
