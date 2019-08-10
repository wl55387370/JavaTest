package com.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用频率最高的Hashset构造方法完成set的实例化
		Set<String> sSet= new HashSet<String>();
		
		sSet.add("树状的狗");
		sSet.add("哈士奇");
		sSet.add("萨摩耶");
		sSet.add("阿拉斯加");
		//set是无序的
		System.out.println(sSet);
		//foreach循环遍历内容进行操作。
		for(String s:sSet) {
			s+="没有姓名";
			System.out.println(s);
		}
		//删除一个元素
		sSet.remove("树状的狗");
		System.out.println(sSet);
		//集合中还剩3个元素，取值时，只能取三次，而对应的set不会变化。
		//迭代器使用的过程当中，取一次一次值之后，不再对元素进行第二次操作，类似于抽奖券时，抽出来之后，放一边，不会再抽，但是元素不会被删除。
		Iterator<String> sIt=sSet.iterator();
		//hasNext判断集合中是否还有未操作的元素
//		System.out.println("第一次判断是否有元素："+sIt.hasNext());
//		//取出集合中的下一个元素
//		System.out.println("第一次取值："+sIt.next());
//		//hasNext判断集合中是否还有未操作的元素
//		System.out.println("第2次判断是否有元素："+sIt.hasNext());
//		//取出集合中的下一个元素
//		System.out.println("第2次取值："+sIt.next());
//		//hasNext判断集合中是否还有未操作的元素
//		System.out.println("第3次判断是否有元素："+sIt.hasNext());
//		//取出集合中的下一个元素
//		System.out.println("第3次取值："+sIt.next());
//		//hasNext判断集合中是否还有未操作的元素
//		System.out.println("第4次判断是否有元素："+sIt.hasNext());
//		//取出集合中的下一个元素
//		System.out.println("第4次取值："+sIt.next());
//		System.out.println("取值完成之后"+sSet);
		while(sIt.hasNext()) {
			System.out.println(sIt.next()+"很可爱");
		}
		
		
	}

}
