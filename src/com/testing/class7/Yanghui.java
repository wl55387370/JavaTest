package com.testing.class7;

import java.util.Arrays;

public class Yanghui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 杨辉三角实现，下层等于上层的数组肩上两个数相加
		 */
		// 先确认杨辉三角输出多少层
		int yh = 5;
		// 需要两个数组进行循环记录
		int[] arr1 = new int[yh];
		int[] arr2 = new int[yh];
		arr1[0] = 1;
//		//外层循环，遍历每一层，从第1层，直到最后的第yh层，1/通过arr1来计算arr2的值，2/并且在计算完成输出之后，将arr2赋值给arr1
		for (int ceng = 1; ceng <= yh; ceng++) {
			
			System.out.println("执行前的arr1");
			for(int i:arr1) {
			System.out.print(i+" ");
			}
			System.out.println();
			// 内层循环1，通过arr1来计算arr2的值，每一行的值都计算出来
			for (int xiabiao = 0; xiabiao <= ceng - 1; xiabiao++) {
				// 每一层前后的两个数都是1
				if (xiabiao == 0 || xiabiao == ceng - 1) {
					arr2[xiabiao] = 1;
				}
				// 如果不是一行中最前最后的两位，对应的值是上层肩上两个数之和
				else {
					arr2[xiabiao] = arr1[xiabiao] + arr1[xiabiao - 1];
				}
			}
			// 在输出所有的数之前，进行空格的计算和输出，注意format输出的时候尽量使用偶数
			// 最后一行前面空半格，最上一行，相应空总层数-当前层数+1个半格
//			int space = (yh - ceng) * 4 / 2;
//			String format = "%" + space + "s";
//			// 由于占位格数不能是0，所以先判断一下，最后一个位子输出的时候，不要空格。
//			if (space != 0) {
//				System.out.format(format, "");
//			}
//			// 外层循环做的第二个事：遍历输出当前行arr2的所有值，遍历输出的时候，只输出到arr2中ceng数对应的这一位
//			for (int j = 0; j < ceng; j++) {
//				System.out.format("%-4d", arr2[j]);
//			}
//			// 每一层输出完成之后进行换行操作
//			System.out.println();
			/**
			 * 外层循环中的第三个操作：将arr2的值复制到arr1，以准备开始下次循环的计算。
			 */
			// 将arr2复制到arr1
			// 遍历arr2中直到ceng-1为止的每个数字，对应地赋值给arr1
//			for (int k = 0; k < ceng; k++) {
//				arr1[k] = arr2[k];
//			}
			arr1=arr2;
			System.out.println("arr1的值：");
			for(int i:arr1) {
			System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("arr2的值：");
			for(int i:arr2) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

