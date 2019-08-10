package com.testing.class6;

public class String2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//其他类型转String
//		int a=1;
//		String s=a+"";
//		System.out.println(s);
//		
//		Integer iA=123;
//		String iS=iA.toString();
//		System.out.println(iS);
//		//调用String类的静态方法 valueOf进行转换
//		String ss=String.valueOf(a);
		
		//String转对应的类型
		String s1="1234";
		String s2="134.5";
		//调用对应类型的parse方法进行String的转换
		int i1;
		try {
			i1 = Integer.parseInt(s1);
			System.out.println(i1);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//输出异常的堆栈信息
			System.out.println("不是一个整数，请重试");
//			e.printStackTrace();
		}
		
		float f1=Float.parseFloat(s2);
		System.out.println(f1);
		
	}

}
