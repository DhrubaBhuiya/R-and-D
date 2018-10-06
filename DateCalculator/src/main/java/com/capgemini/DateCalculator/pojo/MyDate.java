package com.capgemini.DateCalculator.pojo;

public class MyDate {
	private int dd,mm,yyyy;

	public MyDate(int dd, int mm, int yyyy) {

		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDay() {
		return dd;
	}

	public int getMonth() {
		return mm;
	}

	public int getYear() {
		return yyyy;
	}
	
}
