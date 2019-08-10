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
public class PlusDoubleTest {

	public double dN1;
	public double dN2;
	private String exResult;
	private static Plus pl;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pl=new Plus();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	public PlusDoubleTest(String caseName,String expectedResult,double first,double second) {
		dN1=first;
		dN2=second;
		exResult=expectedResult;
	}

	@Parameters(name= "{0}")
	public static Object[][] doubleSumData(){
		return new Object[][] {
			{"左边界-1","12344.5",12345.5,-1},
			{"左边界+0","12345.5",12345.5,0},
			{"左边界+1","12346.5",12345.5,1}
		};
	}

	@Test
	public void testSumDoubleDouble() {
		 double actualResult=pl.Sum(dN1, dN2);
		 assertEquals(exResult, actualResult+"");
	}

}
