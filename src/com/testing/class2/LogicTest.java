package com.testing.class2;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2;
		//按位或操作，不管第一个条件是否为真，都先把所有条件运算完成之后，再进行或的运算，因此，b的值会发生变化
		boolean ta= a==1|--b==2;
		System.out.println(ta);
		System.out.println(b);
		
		int c=1,d=2;
		//逻辑或判断了第一个条件为真之后，就可以得到最终结果为真，所以第二个条件不进行判断，因此d的值没有发生变化
		boolean tb= !(c==1)&&--d==11;
		System.out.println(tb);
		System.out.println(d);
	}

}
