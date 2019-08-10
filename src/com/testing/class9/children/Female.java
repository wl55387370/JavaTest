package com.testing.class9.children;

import com.testing.class9.parent.Human;

public class Female extends Human{
	//
	public String hair="一头秀发";
	
	public void shopping() {
		System.out.println("买买买");
	}
	
	//孙子类重写爷爷类
	public void sleep() {
		System.out.println("女孩子睡美容觉");
	}
	
	//final方法不能被重写
//	public int earnMoney() {
//		return 1;
//	}
//	
}
