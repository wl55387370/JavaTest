package com.testing.class11.wbit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.testing.class11.Plus;
@RunWith(Parameterized.class)
public class PlusTestWithParam {
	//成员变量，plus类
	private static Plus pl;
	//使用的参数
	private int No1;
	private int No2;
	private String exResult;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pl=new Plus();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//构造方法
	public PlusTestWithParam(String caseName,String expectedResult,int first,int second) {
		No1=first;
		No2=second;
		exResult=expectedResult;
	}
	
	
	@Parameters(name="{0}")
	public static Object[][] sumData() {
		return new Object[][] {
			{"左边界-1","-2147483649",-2147483648,-1},
			{"左边界+0","-2147483648",-2147483648,0},
			{"左边界+1","-2147483647",-2147483648,1}
		};
		
	}
	
	@Test
	public void testSumInt() {
		 int actualResult=pl.Sum(No1, No2);
		 assertEquals(exResult, actualResult+"");
	}



}
