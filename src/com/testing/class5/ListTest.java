package com.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数据结构中不能使用基本数据类型作为element
		List<Integer> iL = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			iL.add(i);
		}
		// 往指定的下标位置插入值
		iL.add(5, 11);
		// 移除第7位即下标为6的数字
		iL.remove(6);
		// 改动某个位置的值
		iL.set(7, 18);
		
		System.out.println(iL);
		// foreach循环
		for (int i : iL) {
			System.out.print(i + " ");
		}
		// for循环
		for (int xiabiao = 0; xiabiao < iL.size(); xiabiao += 2) {
			System.out.println("第" + (xiabiao + 1) + "个数为" + iL.get(xiabiao));
		}
		// 迭代器
		Iterator<Integer> lIt = iL.iterator();
		while (lIt.hasNext()) {
			System.out.println(lIt.next());
		}

	}

}
