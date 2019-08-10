package com.testing.class6;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="royroyroy帅";
//		String s2="royro肥";
//		String s3="roy.";
//		String royRg="^(roy){1,3}.$";
//		System.out.println(s1.matches(royRg));
//		System.out.println(s2.matches(royRg));
//		System.out.println(s3.matches(royRg));
		
		//手机号码的格式匹配，第一位为1，第二位为[3-9],之后出现9个任意数字
		String mobileRg="^1[3-9]\\d{9}$";
		String mobile1="21234123412";
		String mobile2="12341234123";
		String mobile3="13800138000";
		String mobile4="138000138000";
		String mobile5="138000";
		System.out.println(mobile1.matches(mobileRg));
		System.out.println(mobile2.matches(mobileRg));
		System.out.println(mobile3.matches(mobileRg));
		System.out.println(mobile4.matches(mobileRg));
		System.out.println(mobile5.matches(mobileRg));
		
		//使用replaceAll结合正则表达式来对字符串的字符进行替换，比起普通replace更便于进行批量替换。
		String arr="[1, [2, 3, 5, 4, 6, 9, 7, 8, 0]";
		String arr1=arr.replaceAll("[12345],", "x");
		System.out.println(arr1);
		String arr2=arr1.replaceAll("[\\[\\],]", "");
		System.out.println(arr2);
		
		//基于分隔符，完成分割的操作
		String[] arrs=arr.split("[\\[\\],]");
		for(String simpleStr:arrs) {
			System.out.println(simpleStr);
		}
	}

}
