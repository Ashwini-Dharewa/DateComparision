package com.capgemini;

public class DateDifferenceProvider {
	
	static int monthArray[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
	public static int getDateDifference(MyDate startDate,MyDate endDate)
	{
		if(isSameDay(startDate,endDate) && isSameMonth(startDate,endDate) && isSameYear(startDate,endDate))
			return 0;
		
		else if(isSameMonth(startDate,endDate) && isSameYear(startDate,endDate))
			return getSameYearDays(startDate,endDate);
		
		else if(isSameYear(startDate,endDate) && checkLeapYear(startDate.getYyyy()))
		{
			return getDays(startDate,endDate)+getMonths(startDate,endDate)+1;
		}
		
		else if(isSameYear(startDate,endDate))
			return getDays(startDate,endDate)+getMonths(startDate,endDate);
		
		else
		{
			
			if((Math.abs(startDate.getYyyy()-endDate.getYyyy()))==1)
			{
				if(startDate.getMm()<=2 || endDate.getMm()>2)
				{
					if(checkLeapYear(startDate.getYyyy()) || checkLeapYear(endDate.getYyyy()))
					{
						return getDays(startDate,endDate)+getMonths(startDate,endDate)+getYear(startDate,endDate)+1;
					}
					else
						return getDays(startDate,endDate)+getMonths(startDate,endDate)+getYear(startDate,endDate);
				}
				else
					return getDays(startDate,endDate)+getMonths(startDate,endDate)+getYear(startDate,endDate);
			}
			else
			{
				if(startDate.getMm()<=2 || endDate.getMm()>2)
				{
					if(checkLeapYear(startDate.getYyyy()) || checkLeapYear(endDate.getYyyy()))
					{					
						return getDays(startDate,endDate)+getMonths(startDate,endDate)+getYear(startDate,endDate)+calculateYearInBetween(startDate,endDate)+1;
					}
					
					else if(!isSameMonth(startDate,endDate))
					{
						return getDays(startDate,endDate)+getDiffMonth(startDate,endDate)+calculateYearInBetween(startDate,endDate);
					}
					
					else
						
						return getDays(startDate,endDate)+getMonths(startDate,endDate)+getYear(startDate,endDate)+calculateYearInBetween(startDate,endDate);
				}
				else
				{
					return getDays(startDate,endDate)+getMonths(startDate,endDate)+getYear(startDate,endDate)+calculateYearInBetween(startDate,endDate);
				}
					
			}
		}
	}	
	
	public static boolean checkLeapYear(int year) 
	{ 
		boolean leap = false;
		
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        return leap;
	} 
	
	
	public static boolean isSameDay(MyDate startDate,MyDate endDate)
	{
		if(startDate.getDd()==endDate.getDd())
			return true;
		else 
			return false;
	}
	
	public static boolean isSameMonth(MyDate startDate,MyDate endDate)
	{
		if(startDate.getMm()==endDate.getMm())
			return true;
		else 
			return false;
	}
	public static boolean isSameYear(MyDate startDate,MyDate endDate)
	{
		if(startDate.getYyyy()==endDate.getYyyy())
			return true;
		else 
			return false;
	}
	
	public static int getSameYearDays(MyDate startDate,MyDate endDate)
	{
		return Math.abs(endDate.getDd()-startDate.getDd());
	}
	
	public static int getMonths(MyDate startDate,MyDate endDate)
	{
		int monthDiff=0;
		for(int index=startDate.getMm() ; index <endDate.getMm()-1 ; index++)
		{
			monthDiff+=monthArray[index];
		}
		return monthDiff;
	}
	
	public static int getLeapYear(MyDate startDate,MyDate endDate)
	{
		return Math.abs(endDate.getYyyy()-startDate.getYyyy())*366;
	}
	
	public static int getYear(MyDate startDate,MyDate endDate)
	{
		return Math.abs(endDate.getYyyy()-startDate.getYyyy())*365;
	}
	
	public static int calculateYearInBetween(MyDate startDate,MyDate endDate)
	{
		int yearDiff=0;
		int yearDifference=Math.abs(endDate.getYyyy()-startDate.getYyyy());
		for(int index=1;index<yearDifference;index++)
		{
			int year=startDate.getYyyy()+index;
			if(checkLeapYear(year)==true)
				yearDiff+=366;
			else
				yearDiff+=365;
		}
		return yearDiff;		
	}
	
	public static int getDays(MyDate startDate,MyDate endDate)
	{
		return ((monthArray[(startDate.getMm())-1]-startDate.getDd()) + (endDate.getDd()));
	}
	
	public static int getDiffMonth(MyDate startDate,MyDate endDate)
	{
		int monthDiff=0;
		for(int index=startDate.getMm() ; index <12 ; index++)
		{
			monthDiff+=monthArray[index];
		}
		for(int index=0 ; index <endDate.getMm()-1 ; index++)
		{
			monthDiff+=monthArray[index];
		}
		return monthDiff;
	}
	
}
