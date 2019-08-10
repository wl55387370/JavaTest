package com.testing.class3;

public class GauseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//高斯算法，从1加到100
		//首先创建一个暂存的结果
//		int result=0;
//		int num;
//		for(num=1;num<=100;num++) {
//			result+=num;
//		}
//		System.out.println("计算结果"+result);
		
		//每次输出都换行
		for(int i=1;i<=100;i++) {
			//如果能被3整除，那么这个数对3取余等于0
			if (i%3==0) {
				System.out.println(i);
			}
		}
		//所有结果一行输出
		//求100以内被3的倍数，循环100次，只有碰到能被3整除时才输出
		for(int i=1;i<=100;i++) {
			//如果能被3整除，那么这个数对3取余等于0
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
		//输出一个空的行，相当于换行操作
		System.out.println();
		
		//更好的算法,只需要循环33次
		for(int i=3;i<=100;i+=3) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
