package com.testing.class5;

import com.testing.class4.Dog;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接给数组赋值
		int[] a= new int[]{1,2,3};
		System.out.println(a[0]);
		for(int xiabiao=0;xiabiao<3;xiabiao++)
		{
			System.out.print(a[xiabiao]+",");
		}
		System.out.println();
		//先指定数组长度，再赋值
		int[] a1=new int[3];
		for(int xiabiao=0;xiabiao<3;xiabiao++)
		{
			System.out.print(a1[xiabiao]+",");
		}
		System.out.println("修改之后：");
		//对数组中的元素进行赋值操作
		a1[0]=4;
		a1[1]=5;
		a1[2]=6;
		//赋值之后再输出
		for(int xiabiao=0;xiabiao<a1.length;xiabiao++)
		{
			System.out.println("长度是"+a1.length);
			System.out.print(a1[xiabiao]+",");
		}
		//这里输出的会是数组类型以及所在的内存引用地址。
		System.out.println("直接输出数组："+a);
		//增强型for循环，foreach循环，直接取出容器中的所有元素进行操作。
		for(int i:a1) {
			System.out.print(i+" ");
		}
		//创建一组dog
		Dog[] z=new Dog[1]; 
		
		String[] sA= {"roy","喜欢","吃肉"};
		for(String s:sA) {
		System.out.println(s);
		}
		
		
	}

}
