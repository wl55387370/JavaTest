package com.testing.class10.ab;

public class TryAb {

public static void main(String[] args) {
	//抽象类在进行实例化时，必须先完成抽象方法的实现
	TestAb a=new TestAb() {
		//重写抽象方法，真正实现。
		@Override
		public void method() {
			// TODO Auto-generated method stub
			
		}
	};
}
}
