package com.testing.class7;

public class Homework6 {
	public static void main(String[] args) {
		String regex="^\\w{3,}@\\w{2,10}\\.com$";
		String ss1="12345@qqzcom";
		String ss="12345@sina.com";
		System.out.println(ss1.matches(regex));
		System.out.println(ss.matches(regex));
	}
}
