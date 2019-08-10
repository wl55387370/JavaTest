package com.testing.class8;

public class FibCalc {
	//计算第n位斐波那契数的值
	//规律：第n个数是前两个数相加之和
	public static int FibCalculate(int n) {
		int result=0;
		//递归迭代出口
		//第一个和第二个数是固定的为1
		if(n==1||n==2) {
			result=1;
		}
		else {
			//其它情况下递归
			result=FibCalculate(n-2)+FibCalculate(n-1);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibRes=FibCalculate(8);
		System.out.println(fibRes);
	}

}
