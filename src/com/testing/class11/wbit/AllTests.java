package com.testing.class11.wbit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//用suite的方式管理测试用例的运行
@RunWith(Suite.class)
//包含的测试类
@SuiteClasses({  PlusTestWithParam.class,PlusDoubleTest.class,com.testing.class11.LoginSampleTest.class })
public class AllTests {

}
