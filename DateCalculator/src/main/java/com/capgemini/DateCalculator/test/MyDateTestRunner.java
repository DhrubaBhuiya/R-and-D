package com.capgemini.DateCalculator.test;

import java.util.ArrayList;

import com.capgemini.DateCalculator.pojo.MyDate;
import com.capgemini.DateCalculator.service.DateDifferenceProvider;

public class MyDateTestRunner {

	public static void main(String[] args) {
		
		ArrayList<MyDateTestRecord> testCases = new ArrayList<MyDateTestRecord>();
		
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(6, 4, 2011), 
						0
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 4, 2011), 
						12
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 5, 2011), 
						42
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 6, 2011), 
						73
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 12, 2011), 
						256
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 12, 2012), 
						622
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 12, 2013), 
						987
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 12, 2113), 
						37511
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 12, 2413), 
						147084
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 4, 2011), 
						new MyDate(18, 12, 2813), 
						293181
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 1, 2011), 
						new MyDate(6, 3, 2011), 
						59
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 1, 2012), 
						new MyDate(6, 3, 2012), 
						60
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 2, 2012), 
						new MyDate(6, 3, 2012), 
						29
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(22, 1, 2012), 
						new MyDate(15, 11, 2012), 
						298
						)
				);
		testCases.add(
				new MyDateTestRecord(
						new MyDate(6, 2, 2012), 
						new MyDate(6, 12, 2012), 
						304
						)
				);
		
		for(MyDateTestRecord testCase : testCases){
			MyDate startDate = testCase.startDate;
			MyDate endDate = testCase.endDate;
			long expectedResult = testCase.expectedRsult;
			long obtainedResult = DateDifferenceProvider.getDateDifference(startDate, endDate);
			
			if(expectedResult == obtainedResult)
				System.out.println("Test " + (1 + testCases.lastIndexOf(testCase)) + " Passed obtainedResult="+obtainedResult+" expectedResult="+expectedResult);
			else
				System.err.println("Test " + (1 + testCases.lastIndexOf(testCase)) + " Failed obtainedResult="+obtainedResult+" expectedResult="+expectedResult);
		}
		

	}

}
