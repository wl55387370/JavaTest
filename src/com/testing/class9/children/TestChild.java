package com.testing.class9.children;
//不同包中使用其它的类时，需要import指定。
import com.testing.class9.parent.Bird;

public class TestChild {
	public static void main(String[] args) {
		Female girl=new Female();
		girl.sleep();
		girl.study("特斯汀学院VIP课程");
		girl.earnMoney();
		girl.shopping();
		
		Bird niao=new Bird();
		
	}
	
	
}
