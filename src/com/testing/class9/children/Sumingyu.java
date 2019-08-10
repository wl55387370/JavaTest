package com.testing.class9.children;

import com.testing.class9.parent.Sudaqiang;

public class Sumingyu extends Sudaqiang{
	public String job="销售";
	public void live() {
	}
	
	public void showBook() {
		super.book();
	}
	
	public static void main(String[] args) {
		Sumingyu girl = new Sumingyu();
		girl.book();
	}
}
