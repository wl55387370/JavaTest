package com.testing.class8;

public class JieCheng {
	
	//封装方法计算n的阶乘
	public static int Fatorial(int n) {
		int result=0;
		//递归的迭代出口,当计算到1的阶乘的时候不再需要进行递归
		if(n==1) {
			result=1;
		}
		else{
			//不等于1时，都用递归方式来进行计算
			//n的阶乘等于n乘以n-1的阶乘
			result=n*Fatorial(n-1);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tenJ=Fatorial(4);
		System.out.println(tenJ);
	}

}
