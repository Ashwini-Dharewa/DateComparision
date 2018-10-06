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

/*else if(Math.abs(startDate.getMm()-endDate.getMm())==1)
{
	
	int monthDiff=(monthArray[startDate.getMm()-1]);
	int dayDiff=Math.abs(endDate.getDd()-startDate.getDd());
	return monthDiff+dayDiff;
}
if(startDate.getMm()==endDate.getMm())
				return Math.abs(endDate.getDd()-startDate.getDd());
*/
/*public static int getDateDifference(MyDate startDate,MyDate endDate)
{
	
	if(Math.abs(startDate.getYyyy()-endDate.getYyyy())>1)
	
	
	
	
		if(checkLeapYear(startDate.getYyyy())  || checkLeapYear(endDate.getYyyy()))
		{				
			int yearDiff=Math.abs(startDate.getYyyy()-endDate.getYyyy())*366;
			int monthDiff=0;
			for(int index=startDate.getMm()-1 ; index <endDate.getMm()-1 ; index++)
			{
				monthDiff+=monthArrayLeap[index];
			}
			int dayDiff=Math.abs(endDate.getDd()-startDate.getDd());
			return monthDiff+dayDiff+yearDiff;
		}
			
	int yearDiff=Math.abs(startDate.getYyyy()-endDate.getYyyy())*365;
	int monthDiff=0;
	for(int index=startDate.getMm()-1 ; index <endDate.getMm()-1 ; index++)
	{
		monthDiff+=monthArray[index];
	}
	int dayDiff=Math.abs(endDate.getDd()-startDate.getDd());
	return monthDiff+dayDiff+yearDiff;
}*/