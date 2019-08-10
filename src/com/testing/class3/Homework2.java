package com.testing.class3;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输入x的值，从控制台读取
		System.out.println("请输入一个数字：");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			if (x > 1 && !(x < 5) || x < -3) {
				// 输出符合x取值范围的区间
				// x<-3∪x>=5
				System.out.println("x的取值范围是：(-∞,-3)∪[5,+∞)");
			} else {
				// 不符合的区间
				System.out.println("x的错误范围是：[-3,5)");
			}
			// 关闭scanner，释放资源
		}
		sc.close();// main方法结束
	}
}
