package com.capgemini;

public class MyDateTestRecord {
	
	public MyDate startDate;
	public MyDate endDate;
	public long expectedResult;
	
	public MyDateTestRecord(MyDate startDate, MyDate endDate, int expectedResult) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedResult = expectedResult;
	}

}

