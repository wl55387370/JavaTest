package com.testing.class4;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求 2到100中的质数，质数的特点：除了1和自身之外没有其他约数
		for(int i=2;i<=100;i++) {
			
			int j=2;
			//逐个递增被除数，看是否有能够被除尽的
			while(i%j!=0) {
				j++;
			}
			//如果最终找到能整除的数是这个数本身，那么这个数就是质数
			if(i==j) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//遍历计算这个数的前一半是否能整除
		for(int i=2;i<=100;i++) {
			int j=2;
			for(;j<=i/2;j++) {
				//如果有约数则跳出循环
				if(i%j==0) {
					break;
				}
			}//for循环没有break退出，说明遍历完了所有要试算的数,这时它是质数，而这时的j的值应该是i/2+1
			//判断循环结束的时候j的值
			if(j==i/2+1) {
				System.out.print(i+" ");
			}
		}
	}

}
