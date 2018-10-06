package com.capgemini.DateCalculator.test;

import com.capgemini.DateCalculator.pojo.MyDate;

public class MyDateTestRecord {
	public MyDate startDate;
	public MyDate endDate;
	public long expectedRsult;
	
	public MyDateTestRecord(MyDate startDate, MyDate endDate, long expectedRsult) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedRsult = expectedRsult;
	}
	
}
