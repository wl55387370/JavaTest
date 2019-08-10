//包名
package com.testing.class4;
//类的声明
public class Dog {
	//类体
	//变量的声明定义(属性)
	public int age=0;
	//没有被static修饰的成员变量也称作实例变量
	public String ear="尖耳朵";
	public String nose="朝北鼻";
	public String hairColor="黑色";
	public String gender;
	//类变量，也称作静态变量
	public static String eyes="可爱的大眼睛";
	//永远不会发生变化的变量，即常量
	public final static String TYPE="狗";
//	//构造方法
	public Dog() {
		
	}
	//重载构造方法，增加参数列表。
//	public Dog(String gender_1) {
//		gender=gender_1;
//	}
	public Dog(String gender) {
		this.gender=gender;
	}
	
	

	//变量的方法
	public void bark() {
		System.out.println("小"+gender+"狗汪汪汪地叫");
	}
	
	public static String showEyes() {
		return eyes;
	}
	
	public int grow(int year) {
		age+=year;
		return age;
	}
	
	public int grow() {
		age++;
		return age;
	}

	public int grow(double year,int month) {
		age+=year;
		return age;
	}
	
	
	
	
}
