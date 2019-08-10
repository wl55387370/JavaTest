package com.testing.class4;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个Dog类型的对象小白
		// 声明一个对象，并且分配内存空间，相当于申请了一个叫做小白的柜子
		Dog xiaoBai;
		// 实例化的操作在内存空间里存储内容
		xiaoBai = new Dog();
		Dog xiaoHei = new Dog();
		Dog xiaoHuang=new Dog();
		//常量不能被修改，否则会报错
//		Dog.TYPE="123";
		System.out.println("狗类的眼睛是"+Dog.eyes);
		System.out.println("修改前小白的毛色" + xiaoBai.hairColor);
		System.out.println("修改 前小白的眼睛" + xiaoBai.eyes);
		System.out.println("修改前小黑的毛色" + xiaoHei.hairColor);
		System.out.println("修改前小黑的眼睛" + xiaoHei.eyes);
		//普通成员变量
		xiaoBai.hairColor = "白色";
		//被static修饰的静态变量
		xiaoBai.eyes = "黑眼睛";
		System.out.println("小白的毛色" + xiaoBai.hairColor);
		System.out.println("小白的眼睛" + xiaoBai.eyes);
		// 输出小黑的发色
		System.out.println("小黑的毛色" + xiaoHei.hairColor);
		System.out.println("小黑的眼睛" + xiaoHei.eyes);
		System.out.println("小黄的眼睛" +xiaoHuang.eyes);
		System.out.println("狗类修改之后的眼睛："+Dog.eyes);
//		//使用狗的眼睛属性成员变量
//		System.out.println("眼睛是："+xiaoBai.eyes);
//		//调用方法
//		xiaoBai.bark();
//		//通过对应的变量类型接收方法返回的结果
//		int nowAge=xiaoBai.grow(2);
//		System.out.println("小白现在"+nowAge+"岁了");
//		//调用String
//		String ss=xiaoBai.showEar();
//		System.out.println(ss);
		
	}

}
