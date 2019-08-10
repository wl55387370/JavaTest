package com.testing.class3;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		//while循环语句中只负责判断布尔表达式
		while(i<=10) {
			//while循环体中的内容，完成重复的动作
			System.out.println("第"+i+"次报数");
			i++;
		}
		System.out.println("执行完成之后i的结果"+i);
		
		int a=11;
		//不管循环条件是否成立，先执行一次循环体语句，再做判断
		do {
			
			System.out.println("第"+a+"次报数");
			a++;
		}
		while(a<=10);
		System.out.println("执行完成之后a的结果"+a);
	}

}
