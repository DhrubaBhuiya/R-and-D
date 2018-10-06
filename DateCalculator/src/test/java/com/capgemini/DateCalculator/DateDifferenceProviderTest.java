package com.capgemini.DateCalculator;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.DateCalculator.pojo.MyDate;
import com.capgemini.DateCalculator.service.DateDifferenceProvider;

public class DateDifferenceProviderTest {
	
	@Test
	public void getDateDifferenceTest1(){
		long expectedResult = 0;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(6, 4, 2011));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest2(){
		long expectedResult = 12;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 4, 2011));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest3(){
		long expectedResult = 42;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 5, 2011));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest4(){
		long expectedResult = 73;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 6, 2011));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest5(){
		long expectedResult = 256;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 12, 2011));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest6(){
		long expectedResult = 622;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 12, 2012));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest7(){
		long expectedResult = 987;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 12, 2013));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest8(){
		long expectedResult = 37511;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 12, 2113));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest9(){
		long expectedResult = 147084;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 12, 2413));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest10(){
		long expectedResult = 293181;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 4, 2011), new MyDate(18, 12, 2813));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest11(){
		long expectedResult = 59;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 1, 2011), new MyDate(6, 3, 2011));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest12(){
		long expectedResult = 60;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 1, 2012), new MyDate(6, 3, 2012));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest13(){
		long expectedResult = 29;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 2, 2012), new MyDate(6, 3, 2012));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest14(){
		long expectedResult = 298;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(22, 1, 2012), new MyDate(15, 11, 2012));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	@Test
	public void getDateDifferenceTest15(){
		long expectedResult = 304;
		long obtainedResult = DateDifferenceProvider.getDateDifference(new MyDate(6, 2, 2012), new MyDate(6, 12, 2012));
		Assert.assertEquals(expectedResult, obtainedResult);
	}
	
}
