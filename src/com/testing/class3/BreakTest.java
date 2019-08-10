package com.testing.class3;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++) {
			//判断i的值是否符合跳出事件条件
			if(i==5) {

			}
			else {
				System.out.println("第" + i + "次报数");
			}
		}//for循环体
		System.out.println("执行完成之后i的结果"+i);
		
//		int a=1;
//		while(a<=10) {
//			if(a==5) {
//				System.out.println("触发跳出事件");
//				a++;
//			}
//			//while循环体中的内容，完成重复的动作
//			else {
//			System.out.println("第"+a+"次报数");
//			a++;
//			}
//		}
//		System.out.println("执行完成之后a的结果"+a);
	}
//	

}
