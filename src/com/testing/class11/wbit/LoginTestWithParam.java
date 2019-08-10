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

import com.testing.class11.LoginSample;
//声明这个测试类使用参数化设置的方式来运行
@RunWith(Parameterized.class)
public class LoginTestWithParam {
	
	private static LoginSample ls;
	//成员变量存储和接收生成的数据
	private String username;
	private String password;
	private String exResult;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ls=new LoginSample();
		System.out.println("********测试开始执行***********");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	//构造方法用于将@parameter方法生成的数据赋值给成员变量
	//即使不使用某一个参数，也需要在构造方法参数列表中完成一一对应
	public LoginTestWithParam(String caseName,String paramUser,String paramPwd,String expectedResult) {
		//将从@parameter注解方法中获取到的参数，赋值给成员变量
		username=paramUser;
		password=paramPwd;
		exResult=expectedResult;
	}
	
	//完成测试数据的生成和返回,注意该方法必须是静态方法，因为数据要在类生成之前完成初始化
	//name="{2}"表示从生成的二维数组中，一维数组对应下标的元素作为用例的名称
	@Parameters(name="{0}")
	public static Object[][] loginData(){
		return new Object[][] {
			{"正常用例","Roy", "123456","恭喜您，登录"},
			{"用户名过长","royroyroyroyroyroyroy", "123456","参数错误！"},
			{"用户密码错误","roy", "123456","用户名或密码错误！"},
			{"密码为空","Roy", null,"参数错误！"}
		};
	}
	
	//测试方法使用成员变量作为数据来完成测试
	@Test
	public void testLogin() {
		boolean result=ls.login(username, password);
//			try {
//				assertTrue(!result);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		assertEquals("结果校验", exResult, ls.resultMSG);
	}

}
