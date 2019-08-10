package com.testing.class3;

public class NineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// 外层循环，完成每一行的循环，重复做的动作包括将9列的内容拼接起来，并且换行
//		for (int line = 1; line <= 9; line++) {
////			System.out.println("这是第"+line+"行");
//			// 内层循环，完成每个格子的填写，内层循环完成之后，每一行中的内容就已经确定了
//			for (int column = 1; column <= 9; column++) {
//				// 按照图表中的规则，列的数字在前
//				System.out.print(column + "×" + line + "=" + (column * line) + "   ");
//			} // 内层循环结束
//				// 在不同的行之间进行换行
//			System.out.println();
//		}
//		System.out.println();
//		// 格式化输出
//		for (int line = 1; line <= 9; line++) {
////			System.out.println("这是第"+line+"行");
//			// 内层循环，完成每个格子的填写，内层循环完成之后，每一行中的内容就已经确定了
//			for (int column = 1; column <= 9; column++) {
//				// 按照图表中的规则，列的数字在前
//				System.out.format("%-8s",column + "×" + line + "=" + (column * line));
//			} // 内层循环结束
//				// 在不同的行之间进行换行
//			System.out.println();
//		}
		
		// 格式化输出 去除对角线
		for (int line = 1; line <= 9; line++) {
//			System.out.println("这是第"+line+"行");
			// 内层循环，完成每个格子的填写，内层循环完成之后，每一行中的内容就已经确定了
			for (int column = 1; column <= 9; column++) {
				//当行和列相等时不进行内容输出，去掉第一条对角线,当行和列相加等于10时，去掉第二条对角线
				if(column==line||line+column==10) {
					//对角线的位置填空
					System.out.format("%-8s","");
				}
				else {
				// 按照图表中的规则，列的数字在前
				System.out.format("%-8s",column + "×" + line + "=" + (column * line));
				}
			} // 内层循环结束
				// 在不同的行之间进行换行
			System.out.println();
		}

	}

}
