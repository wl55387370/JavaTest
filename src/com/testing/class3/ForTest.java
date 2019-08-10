package com.testing.class3;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 实现报数
		int i = 1;
		for (;;) {
			// for循环体
			// 重复动作
			// 如果满足条件，则执行对应的语句操作
			if (i <= 10) {
				System.out.println("第" + i + "次报数");
				++i;
			}
			// 如果不满足条件，结束for循环的执行
			else {
				System.out.println("最后一次执行时i的值" + i);
				//i变成11之后，首先会去运行到条件判断语句，不成立才完成最后的for循环结束
				break;
			}
		}
		System.out.println("执行完成之后i的值是：" + i);
	}

}
