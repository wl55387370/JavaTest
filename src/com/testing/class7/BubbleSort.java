package com.testing.class7;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		//外层循环，负责执行的轮数的控制，第n轮需要比较的数字是length-n
		for(int lun=1;lun<=a.length-1;lun++) {
			//内层循环，比较两个数字之间的大小,循环控制变量代表的是数组的下标
			for(int xiabiao=0;xiabiao<=a.length-lun-1;xiabiao++) {
				//比较相邻的两个数，如果左边的数更大，则交换两个数的位置
				if(a[xiabiao]>a[xiabiao+1]) {
					//用一个新的变量暂时存储左边的值
					int tmp=a[xiabiao];
					//将右边的值赋值给左边的位置
					a[xiabiao]=a[xiabiao+1];
					//将临时存储的左边的值赋值给右边的位置
					a[xiabiao+1]=tmp;
				}
			}
//			System.out.print("第"+lun+"轮排序的结果：");
//			//每一轮比较完成之后，输出一下相应的结果
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
