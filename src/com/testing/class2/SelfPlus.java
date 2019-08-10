package com.testing.class2;

public class SelfPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a =1;
//		System.out.println(--a);
//		System.out.println(a--);
//		
		int b=2;
		++b;
		System.out.println(b);
//		System.out.println(b);
		
//		int x=1;
//		int z= ++x + ++x + ++x;
//		//       2    3     4  x=4
//		int y= x++ + x++ + x++;
//		//		4	  5	    6
//		System.out.println("x的值是"+x);//7
//		System.out.println("前自增结果"+z); //9
//		System.out.println("后自增结果"+y); //15
		
		int x=2,y=3;
		int  z = x++ * 2 + ++x * 2 + y-- * 2 + --y * 2;
		//       2 * 2  +  4*2   + 3*2 + 1*2
		//          x=3	   x=4     y=2    y=1
		System.out.println("x的值是"+x);
		System.out.println(z); 
		System.out.println(y); 
		

	}

}
