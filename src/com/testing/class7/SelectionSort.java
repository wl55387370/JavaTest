package com.testing.class7;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 每一轮挑选出最小的数，放到当前的数组最前面
		 */
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		// 外层循环为比较的轮次
		for (int lun = 1; lun <= a.length - 1; lun++) {
			// 假设每次比较时，最小的数都是当前还没有比较完的数里面的第一个，即a[lun-1]
			int minNum = a[lun - 1];
			int minIndex = lun - 1;
			// 在一轮比较的过程中，比较的数从当前第一个lun-1开始，直到最后一个,完成内层循环之后，找打了当前最小的数
			for (int xiabiao = lun - 1; xiabiao <= a.length - 1; xiabiao++) {
				// 每个数和minNum进行比较，如果比minNum小，则更新minNum的值，以及当前最小数的下标
				if (a[xiabiao] < minNum) {
					// 更新minNum的值
					minNum = a[xiabiao];
					// 更新最小数的下标位置
					minIndex = xiabiao;
				}
			} // 内层循环结束，找出了最小的数的值和相应的位置
				// 先把当前最小数的位置赋值为原队首的数值
			a[minIndex] = a[lun - 1];
			// 将原队首变为最小的数值
			a[lun - 1] = minNum;
//			System.out.print("第"+lun+"轮排序的结果：");
//			//每一轮比较完成之后，输出一下相应的结果
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
		}
		//排序之后的结果：
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
