package com.testing.class2;



public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int people = 4;
		switch (people) {
		case 5:
			System.out.println("出去郊游");
//			break;
		case 4:
			System.out.println("打麻将");
//			break;
		case 3:
			System.out.println("斗地主");
//			break;
		default:
			System.out.println("宅家");
		}
		//
		int month=3;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("这是春天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("这是秋天");
			break;
			//不满足上述任何case时，执行default（默认）
			default:
				System.out.println("残忍的冬夏");
		}
		
		String food="吃火锅";
		switch(food) {
		case "吃火锅":
			System.out.println("太辣");
			break;
		case "吃日料":
			System.out.println("太淡");
			break;
			default:
				System.out.println("随便");
		}
		

	}

}
