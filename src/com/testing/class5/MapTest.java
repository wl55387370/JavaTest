package com.testing.class5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map创建时，需要制定键和值的类型
		Map<String, String> mapT = new HashMap<>();
		// map添加值,无序存放
		mapT.put("roy", "王帅帅");
		mapT.put("Will", "单身狗");
		mapT.put("土匪", "糟老头子");
		System.out.println(mapT);
		// 修改的时候可以直接使用put来替换里面的值
		mapT.put("roy", "王月半");
		mapT.replace("土匪", "大牛");
		System.out.println(mapT);
//		//遍历的时候，foreach可以有两种方式，遍历所有的键或者遍历键值对，键的类型，决定Set集合中元素的类型。
		Set<String> mapKey = mapT.keySet();
//		for(String s:mapKey) {
//			System.out.println(s+"的特点"+mapT.get(s));
//		}

		// 迭代器从keyset取键，然后从map中取值
		Iterator<String> keyIt = mapKey.iterator();
		// 遍历迭代器，读取值
//		while(keyIt.hasNext()) {
//			System.out.println(keyIt.next()+"的值是："+mapT.get(keyIt.next()));
//		}
		while (keyIt.hasNext()) {
			// 保证next方法在一次判断中只执行一次，从而不会出现noSuchElement的情况
			String key = keyIt.next();
			System.out.println(key + "的值是：" + mapT.get(key));
		}

//		//
//		System.out.println("entry格式：");
//		//遍历入口（键值对的方式），注意set中的元素是Entry<String,String>
//		Set<Entry<String, String>> mapEntry=mapT.entrySet();
//		for(Entry<String,String> es:mapEntry) {
//			System.out.println(es);
//		}

	}

}
