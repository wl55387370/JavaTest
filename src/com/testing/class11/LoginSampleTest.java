package com.testing.class11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginSampleTest {
	//使用一个成员变量实例化需要测试的类，方便Test类当中的测试方法进行使用
	private static LoginSample ls;
	
	//beforeclass方法，在测试类中所有的测试方法执行之前被执行，只执行一次，用来做测试环境的准备工作
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//完成ls类的实例化
		ls=new LoginSample();
		System.out.println("******测试类执行开始*********");
	}
	//afterclass方法，在测试类所有测试方法执行完成之后被执行，只执行一次，用来做测试环境的清理工作
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("******测试类执行结束*********");
	}

	//在每一个测试方法执行之前被执行
	@Before
	public void setUp() throws Exception {
		System.out.println("——————————测试方法执行开始————————");
	}
	//在每一个测试方法执行之后被执行
	@After
	public void tearDown() throws Exception {
		System.out.println("——————————测试方法执行结束————————");
	}

	@Test
	public void testLoginNormal() {
		//如果测试方法运行过程中，本身抛出异常，会是红色的error
//		String s="123a";
//		Integer.parseInt(s);
		boolean result=ls.login("Roy", "123456");
		Assert.assertEquals("输出结果是登录成功", "恭喜您，登", ls.resultMSG);
		assertTrue(result);
	}
	
	@Test
	public void testLoginError() {
		boolean result=ls.login("royroyroyroyroyroyroy", "123456");
		assertEquals("输出结果是参数错误", "参数", ls.resultMSG);
		//如果多个断言中的第一个断言失败，后续的断言不再执行
		assertTrue(result);
	}

	//要被执行的测试方法
	@Test
	public void testLogin() {
		System.out.println("测试方法Login被执行");
		//断言，直接断言本次测试失败
		fail("Not yet implemented");
		
	}
	
	@Test
	public void test2() {
		System.out.println("测试方法2被执行");
	}

	
}
