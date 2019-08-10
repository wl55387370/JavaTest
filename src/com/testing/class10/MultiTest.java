package com.testing.class10;

import com.testing.class9.parent.Human;

public class MultiTest {

	public static void main(String[] args) {
		Dog dog =new Dog();
//		dog.watchDoor();
//		dog.watchDoor("Roy");
		//创建父类对象
		Animal ad;
		//父类引用指向子类对象
		ad=new Dog();
		//向上转型的父类对象不能再使用子类中新增的方法。
//		ad.watchDoor();
		//ad 和 ac 都是动物,但是如果出现了方法重写，同样都是动物，调用相同方法，会呈现不一样的结果，体现多态性。
		Animal ac= new Cat();
//		ad.eat();
//		ac.eat();
		//没有被重写的方法，调用时就不会产生多态。
//		ad.sleep();
//		ac.sleep();
		//向下转型，将动物ac转换成为猫，这时可以使用猫独有的方法
		Cat cat=(Cat)ac;
//		c.superEat();
		//人类的喂食方法
		Slave roy=new Slave();
		//人类方法调用狗类动物
		roy.feed(ad, "狗粮");
		roy.feed(ac, "鱼");
		//需要调用向上转型的方法，可以接收其子类类型
		roy.feed(cat, "猫粮");
		roy.feed(dog, "骨头");
		//ac是一个猫型的动物类，cat才是一个猫类
		roy.feedCat(cat);
	}
}
