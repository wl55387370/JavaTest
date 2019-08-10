//包名
package com.testing.class8;

//类的声明
public class Dog {
	// 类体
	// 变量的声明定义(属性)
	public int age = 0;
	public String name="狗";
	// 没有被static修饰的成员变量也称作实例变量
	public String ear = "尖耳朵";
	public String nose = "朝北鼻";
	public String hairColor = "黑色";
	public String gender = "公";
	// 类变量，也称作静态变量
	public static String eyes = "可爱的大眼睛";
	// 永远不会发生变化的变量，即常量
	public final static String TYPE = "狗";

//	//构造方法
	public Dog() {

	}

	// 重载构造方法，增加参数列表。
	public Dog(String gender_1) {
		gender = gender_1;
	}
	//狗狗实例化时拥有名字和性别
	public Dog (String dogName,String gender_1) {
		gender = gender_1;
		name=dogName;
	}
	
	// 变量的方法
	public void bark() {
		sound();
	}

	public static String showEyes() {
		System.out.println(eyes);
		return eyes;
	}

	public int grow(int year) {
		age += year;
		sound();
		
		return age;
	}

	public void sound() {
		if (age <= 3)
			System.out.println("小" + gender + "狗呜呜地叫");
		else if (age > 3 && age <= 6)
			System.out.println("大" + gender + "狗汪汪汪地叫");
		else
			System.out.println("老" + gender + "狗嗷嗷嗷地叫");
	}

	public int grow() {
		age++;
		bark();
		return age;
	}

	public int grow(double year, int month) {
		age += year;
		return age;
	}
	
	public int grow(int year,double month) {
		return 0;
	}
	
	public static float grow(double a,double b) {
		return 0f;
	}
	
	

	public static void main(String[] args) {
		showEyes();
		grow(10.5,12.5);
	}
	
}
