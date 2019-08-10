package com.testing.class6;

public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="roy";
		String b="老师";
		String c=a+b;
		System.out.println(c);
		System.out.println(c.length());
		String s = "[1, [2, 3, 5, 4, 6, 9, 7, 8, 0]";//下标(0，s.length-1)
		//去除前后的中括号
		//取字符串的子串
		String s1=s.substring(1);
		System.out.println("只用开始下标截取："+s1);
		//substring 截取的时候终点下标对应的内容是被去掉的
		String s2=s.substring(1, s.length()-1);
		System.out.println(s2);
		//替换[]为空字符
		String s3=s.replace("[", "");
		System.out.println(s3);
		System.out.println(s);
		String s4=s3.replace("]", "");
		System.out.println(s4);
		
		System.out.println(s3.contains("1"));
	}

}
