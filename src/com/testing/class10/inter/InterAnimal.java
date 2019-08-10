package com.testing.class10.inter;
//接口声明
public interface InterAnimal {
	//接口体
	//属性，都是常量，可以省略static和final修饰
	public static final int AGE=0;
	String TYPE="动物";
	//方法，都是抽象方法
	public void eat();
	public void sleep();
}
