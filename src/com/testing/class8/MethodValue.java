package com.testing.class8;

import com.testing.class4.Dog;

public class MethodValue {
	
	public static void change(int[] arr,Integer age,String dogName,int weight,Dog dog) {
		//循环遍历数组中的每个值，并且+1
		for(int xb=0;xb<arr.length;xb++) {
			arr[xb]+=1;
		}
		System.out.print("方法内部arr的值是：");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		age+=1;
		System.out.println("调用方法后方法内部的age值是"+age);
		dogName="小黑";
		System.out.println("调用方法后方法内部的dogName值是"+dogName);
		weight=15;
		System.out.println("调用方法后方法内部的weight值是"+weight);
		System.out.println("调用方法前方法内dog的性别是"+dog.gender);
		dog.gender="母";
		System.out.println("调用方法后方法内dog的性别是"+dog.gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,1,1,1};
		Integer oAge=new Integer(1);
		String dName=new String("小白");
		int oWeight=4;
		Dog xh= new Dog();
		change(a, oAge, dName, oWeight, xh);
		System.out.println("----------方法执行后查看参数变化----------------------");
		System.out.print("方法调用后数组a的值是：");
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Integer参数oAge的值是"+oAge);
		System.out.println("String参数dName的值是"+dName);
		System.out.println("int参数oWeight的值是"+oWeight);
		System.out.println("Dog参数xh的性别是"+xh.gender);
	}

}
