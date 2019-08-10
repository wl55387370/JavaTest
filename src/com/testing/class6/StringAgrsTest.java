package com.testing.class6;

public class StringAgrsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=args[0];
		String b=args[1];
		try {
			int ia=Integer.parseInt(a);
			int ib=Integer.parseInt(b);
			if(ia>ib) {
				System.out.println("参数1"+ia+"大于参数2"+ib);
				}
			else if(ia==ib) {
				System.out.println("参数1"+ia+"等于参数2"+ib);
			}
			else {
				System.out.println("参数1"+ia+"小于参数2"+ib);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("输入参数不是整数，请检查");
		}
	}

}
