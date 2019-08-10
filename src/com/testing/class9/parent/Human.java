package com.testing.class9.parent;
//动物的子类，人类
public class Human extends Animal{
	//扩展父类中不存在的属性：名字和性别
	public String name;
	
	public String gender;
	//修改父类中已经存在的属性身高
	public int height=170;
	//子类不能重写父类的构造方法。
//	public Animal() {
//		
//	}
	//无参构造方法
	public Human() {
		super("Roy");
		System.out.println("无参人类出生了");
	}
	
	//构造方法，完成人类的名字属性的赋值。
	public Human(String bornName) {
		super("Roy");
		name = bornName;
	}
	//重载一个构造方法
	public Human(String bornName,String bornGender) {
		//调用构造方法public Human(String bornName)
		this(bornName);
		gender=bornGender;
	}
	
	
	
	public void showHeight() {
		System.out.println("人类的身高是"+height);
		System.out.println("作为动物的人类的身高是"+super.height);
	}
	
	public String haveName(String birthname) {
		name=birthname;
		return "一个叫做"+birthname+"的人类出生了";
	}
	//扩展动物不存在的方法：赚钱
	public final int earnMoney() {
		int money=200000;
		System.out.println("人类赚了20万");
		return money;
	}
	//方法的重写
	public void eat() {
		super.eat();
		System.out.println("人类会选择食物进食");
	}
	//方法的重载
	public void eat(String food) {
		System.out.println("人类选择了吃"+food);
	}
//	//方法和父类的返回类型不同、但是方法名、参数列表相同，不能完成重写，也没法直接重载。
//	public String eat() {
//		System.out.println("人类吃");
//	}
	
	//扩展方法学习
	public void study(String course) {
		System.out.println("人类正在学习"+course);
		
	}
	
	public Human born() {
		
		//直接返回对象本身
		return this;
	}
	

}
