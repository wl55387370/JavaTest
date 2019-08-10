package com.testing.class2;

public class IfTest {
	//方法体
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if(布尔表达式)判断布尔表达式是否成立
//		String a = "没看到卖西瓜的";
//		if (a.equals("看到了卖西瓜的")) {
//			// if语句体，如果小括号中布尔表达式为真则执行
//			System.out.println("买一斤包子");
//			System.out.println("买一个西瓜");
//		}
//		// 如果表达式为假，执行else当中的语句
//		else {
//			System.out.println("买一斤包子");
//		}

		int people = 5;
		String weather = "下雨";
		// if条件判断
		if (people > 4) {
			if (weather.equals("晴天"))
				System.out.println("出去郊游");
			else
				System.out.println("开黑打游戏");
		}
		// 如果不满足第一个条件，剩余还有其他的判断，则用else if来进行多层次的判断
		else if (people == 4) {
			System.out.println("打麻将");
		} else if (people == 3) {
			System.out.println("斗地主");
		} else if (people == 2) {
			System.out.println("看电影");
		} else {
			System.out.println("宅家");
		}
		//三目运算符，判断条件是否成立，如果成立，则值为?之后的值，如果不成立则值为：之后的值
//		int a = people==4?33:44;
//		System.out.println(a);
		
		int a;
		if(people==4) {
			a=33;
		}
		else {
			a=44;
		}
		System.out.println(a);
	}	//main方法结束
	
}//类体结束
