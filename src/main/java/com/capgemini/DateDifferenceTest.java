package com.capgemini;

import java.util.ArrayList;

public class DateDifferenceTest {

	public static void main(String[] args) {
		ArrayList<MyDateTestRecord> testData=new ArrayList<MyDateTestRecord>();
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(6,4,2011),0));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,4,2011),12));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,5,2011),42));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,6,2011),73));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2011),256));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2012),622));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2013),987));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2113),37511));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2413),147084));
		testData.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2813),293181));
		testData.add(new MyDateTestRecord(new MyDate(6,1,2011),new MyDate(6,3,2011),59));
		testData.add(new MyDateTestRecord(new MyDate(6,1,2012),new MyDate(6,3,2012),60));
		testData.add(new MyDateTestRecord(new MyDate(6,2,2012),new MyDate(6,3,2012),29));
		testData.add(new MyDateTestRecord(new MyDate(22,1,2012),new MyDate(15,11,2012),298));
		testData.add(new MyDateTestRecord(new MyDate(6,2,2012),new MyDate(6,12,2012),304));
		
		
		
		for(MyDateTestRecord testCase:testData)
		{
			MyDate startDate=testCase.startDate;
			MyDate endDate=testCase.endDate;
			long expectedResult=testCase.expectedResult;
			long obtainedResult=DateDifferenceProvider.getDateDifference(startDate,endDate);
					
			if(expectedResult==obtainedResult)
			{
				System.out.println("Passed: "+"  obtainedResult= "+obtainedResult+" , expectedResult="+expectedResult);
			}
			else
				System.err.println("Failed : "+" obtainedResult= "+obtainedResult+" , expectedResult="+expectedResult);
			
		}
		

	}

}
