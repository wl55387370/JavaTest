package com.testing.class2;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 1;
//		int b = 1;
//		boolean ta = a != b+1;
//		System.out.println(ta);
		//通过常量字符串jay的赋值来创建一个字符串
		String s1="jay";
		String s2="jay";
		//通过创建对象的方式来声明一个字符串
		String s3 = new String("jay");
		System.out.println(s3);
		boolean ts1= s1==s2;
		boolean ts2= s1.equals(s3);
		System.out.println("s1 VS S2"+ts1);
		System.out.println("s1 VS S3"+ts2);
		
	}

}
