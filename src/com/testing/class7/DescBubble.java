package com.testing.class7;

public class DescBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 实现从右往左进行比较的冒泡排序算法
		 */ 
		//第二轮的时候，比较的最后两个数是a[2]和a[1]
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		// 外层循环，循环控制变量依然代表轮次
		for (int lun = 1; lun <= a.length - 1; lun++) {
			// 内层循环的遍历方式
			// 初始下标是最右侧的数字，也就是a.length-1
			for (int xiabiao = a.length - 1; xiabiao >= lun; xiabiao--) {
				// 比较相邻的两个数，如果左边的数更大，则交换两个数的位置
				if (a[xiabiao] > a[xiabiao - 1]) {
					// 用一个新的变量暂时存储左边的值
					int tmp = a[xiabiao];
					// 将右边的值赋值给左边的位置
					a[xiabiao] = a[xiabiao - 1];
					// 将临时存储的左边的值赋值给右边的位置
					a[xiabiao - 1] = tmp;
				}
			}
			System.out.print("第"+lun+"轮排序的结果：");
			//每一轮比较完成之后，输出一下相应的结果
			for(int i:a) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
