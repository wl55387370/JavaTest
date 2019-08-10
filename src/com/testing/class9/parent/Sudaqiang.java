package com.testing.class9.parent;

public class Sudaqiang {
	//私有方法，只有类当中能够使用
	private String money="苏大强的存折";
	String house="苏大强的房子";
	public int a;
	
	public void drink() {
		System.out.println("喝手磨咖啡");
	}
	
	private void buyHouse() {
		System.out.println("买了一栋房子");
	}
	
	protected void book() {
		System.out.println ("给明玉买作业本");
	}
	
	public static void main(String args[]) {
		Sudaqiang father=new Sudaqiang();
		System.out.println(father.money);
	}
}
