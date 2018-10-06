package com.capgemini.DateCalculator.service;

import com.capgemini.DateCalculator.pojo.MyDate;

public class DateDifferenceProvider {
	
	private static final int DAYS_IN_JAN = 31;
	private static final int DAYS_IN_FEB = 28;
	private static final int DAYS_IN_MAR = 31;
	private static final int DAYS_IN_APR = 30;
	private static final int DAYS_IN_MAY = 31;
	private static final int DAYS_IN_JUN = 30;
	private static final int DAYS_IN_JUL = 31;
	private static final int DAYS_IN_AUG = 31;
	private static final int DAYS_IN_SEP = 30;
	private static final int DAYS_IN_OCT = 31;
	private static final int DAYS_IN_NOV = 30;
	private static final int DAYS_IN_DEC = 31;
	
	private static final int DAYS_IN_YEAR = 365;
	private static final int DAYS_IN_LEAP_YEAR = 366;
	
	private static final int FEB = 2;
	
	private static final int[] DAYS_IN_MONTH = {DAYS_IN_JAN,
												DAYS_IN_FEB,
												DAYS_IN_MAR,
												DAYS_IN_APR,
												DAYS_IN_MAY,
												DAYS_IN_JUN,
												DAYS_IN_JUL,
												DAYS_IN_AUG,
												DAYS_IN_SEP,
												DAYS_IN_OCT,
												DAYS_IN_NOV,
												DAYS_IN_DEC
												};
	
	private static boolean isSameDay(MyDate startDate, MyDate endDate){
		return startDate.getDay()==endDate.getDay();
	}
	
	private static boolean isSameMonth(MyDate startDate, MyDate endDate){
		return startDate.getMonth()==endDate.getMonth();
	}
	
	private static boolean isSameYear(MyDate startDate, MyDate endDate){
		return startDate.getYear()==endDate.getYear();
	}
	
	private static boolean isLeapYear(int yearIndex) {
		if(yearIndex%4!=0)
			return false;
		if(yearIndex%4==0 && yearIndex%100==0 && yearIndex%400!=0)
			return false;
		return true;
	}
	
	private static boolean isFebruary(int month){
		if(month==FEB)
			return true;
		return false;
	}
	
	private static int daysInMonthLeadingTo(MyDate endDate) {
		return endDate.getDay();
	}

	private static int daysInIntervingMonths(MyDate startDate, MyDate endDate) {
		int days = 0;
		for(int monthIndex = startDate.getMonth()+1; monthIndex<endDate.getMonth(); monthIndex++){
			days+=DAYS_IN_MONTH[monthIndex-1];
			if(isLeapYear(endDate.getYear()) && isFebruary(monthIndex)) days++;
		}
		return days;
	}

	private static int remainingDaysInMonth(MyDate startDate) {
		return (isFebruary(startDate.getMonth()))?DAYS_IN_MONTH[startDate.getMonth()-1]-startDate.getDay()+1:DAYS_IN_MONTH[startDate.getMonth()-1]-startDate.getDay();
	}
	
	private static int daysInYearLeadingTo(MyDate endDate) {
		int days = 0;		
		for(int monthIndex=1; monthIndex<endDate.getMonth(); monthIndex++){
			days+=DAYS_IN_MONTH[monthIndex-1];
			if(isLeapYear(endDate.getYear()) && isFebruary(monthIndex)) days++;
		}
		days+=daysInMonthLeadingTo(endDate);
		return days;
	}

	private static int daysInIntervingYears(MyDate startDate, MyDate endDate) {
		int days=0;
		for(int yearIndex=startDate.getYear()+1; yearIndex<endDate.getYear(); yearIndex++){
			if(isLeapYear(yearIndex))
				days+=DAYS_IN_LEAP_YEAR;
			else
				days+=DAYS_IN_YEAR;
		}
		return days;
	}

	private static int remainingDaysInYear(MyDate startDate) {
		int days = 0;
		days+=remainingDaysInMonth(startDate);
		for(int monthIndex=startDate.getMonth()+1; monthIndex<=DAYS_IN_MONTH.length; monthIndex++){
			days+=DAYS_IN_MONTH[monthIndex-1];
			if(isLeapYear(startDate.getYear()) && isFebruary(monthIndex)) days++;
		}
		return days;
	}

	
	public static long getDateDifference(MyDate startDate, MyDate endDate){
		
		if(isSameDay(startDate, endDate)&&
				isSameMonth(startDate, endDate)&&
				isSameYear(startDate, endDate)){
			
			return 0;
		}
		
		if(isSameMonth(startDate, endDate)&&
				isSameYear(startDate, endDate)){
			
			return endDate.getDay()-startDate.getDay();
		}
		
		if(!isSameMonth(startDate, endDate)&&
				isSameYear(startDate, endDate)){
			
			return remainingDaysInMonth(startDate)
					+ daysInIntervingMonths(startDate,endDate)
					+ daysInMonthLeadingTo(endDate);
		}
		
		if(!isSameYear(startDate, endDate)){
			
			return remainingDaysInYear(startDate)
					+ daysInIntervingYears(startDate,endDate)
					+ daysInYearLeadingTo(endDate);
		}
				
		return 0;
	}
	
}
