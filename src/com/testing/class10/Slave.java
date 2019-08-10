package com.testing.class10;

public class Slave {
	
	public String name ="Roy";
	//对某个动物喂食
	public void feed(Animal pet,String food) {
		System.out.println(name+"正在喂"+pet.type+food);
	}
	
	//对猫喂食
	public void feedCat(Cat cat) {
		System.out.println(name+"正在喂"+cat.type);
	}

}
