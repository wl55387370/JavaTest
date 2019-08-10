package com.testing.class1;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		a*=2; 
		System.out.println(a);
		a=a+2;
		System.out.println(a);
		int b=3;
		//报错原因：%取余操作必须左右两侧都是整型
//		int c= a%b;
//		int d=10;
		//a/b计算之后以最高精度为准得到float结果，高精度无法直接转为低精度,所以报错
//		int x=a/b;
//		System.out.println(x);
		//对a/b的到的float结果进行强制转换为int型。
		int xx=(int)(a/b);
		System.out.println(xx);
		
		float y = (float)(a/b);
		System.out.println(y);
		
		double h=(double)a/b;
		System.out.println(h);
	}

}
