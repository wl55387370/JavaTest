package com.testing.class5;

public class DoubleArray {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		// 二维数组可以看作是一个存放了一维数组元素的数组
		// 二维数组创建时，其中数组元素的长度可以不一致
//		int[][] dA = { { 1 }, { 1, 2 }, { 1, 2, 3 } };
//		// 遍历二维数组中的所有一维数组元素
//		for (int[] a : dA) {
//			// 遍历每个一维数组中的整型元素
//			for (int i : a) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//
//		int[][] dB = new int[3][3];
//		// 二维数组中的下标相当于行和列
//		dB[0][0] = 1;
//		dB[1][0] = 1;
//		dB[1][1] = 2;
//		dB[2][0] = 1;
//		dB[2][1] = 2;
//		dB[2][2] = 3;
//		for (int[] a : dB) {
//			// 遍历每个一维数组中的整型元素
//			for (int i : a) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

		String[][] nine = new String[9][9];
		// 九九乘法表输出的内容转储到字符串数组中
		// 注意循环控制变量是下标的值
		for (int line = 0; line < 9; line++) {
			for (int column = 0; column < 9; column++) {
				// 算法当中的乘数在循环控制变量基础上+1才是真正的乘数
				//输出三角形的九九乘法表
				if (line >= column) {
					//注意下标和乘数之间的关系,\t表示一个制表符
					nine[line][column] = (column + 1) + "×" + (line + 1) + "=" + (line + 1) * (column + 1)+"\t";
				}
			}
		}
		//输出乘法表
		for(String[] sa:nine) {
			for(String s:sa) {
				System.out.print(s+" ");
			}
			System.out.println();
		}

	}

	
	public static void main(String[] args) {
		String[][] nine = new String[9][9];
		// 九九乘法表输出的内容转储到字符串数组中
		// 注意循环控制变量是乘数
		for (int line = 1; line <= 9; line++) {
			for (int column = 1; column <= 9; column++) {
				// 算法当中的乘数对应的二维数组下标应该-1
				//输出三角形的九九乘法表
				if (line >= column) {
					//注意下标和乘数之间的关系,\t表示一个制表符
					nine[line-1][column-1] = column+ "×" + line + "=" + line * column +"\t";
				}
			}
		}
		//输出乘法表
		for(String[] sa:nine) {
			for(String s:sa) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}
