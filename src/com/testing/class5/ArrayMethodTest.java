package com.testing.class5;

import java.util.Arrays;

public class ArrayMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("数组长度"+a.length);
		//数组管理的类
		//使用Arrays类中的静态方法fill填充元素
		int[] b=new int[3];
		Arrays.fill(a, 112);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
