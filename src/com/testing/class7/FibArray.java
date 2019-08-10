package com.testing.class7;

public class FibArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//斐波那契数列
		int[] a = new int[15];
		// 第一个数和第二个数都是1
		a[0] = 1;
		a[1] = 1;
		// 之后的每个数都等于前面两个数之和，从第3个数开始，下标为2
		for (int xiabiao = 2; xiabiao < a.length; xiabiao++) {
			a[xiabiao] = a[xiabiao - 1] + a[xiabiao - 2];
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
