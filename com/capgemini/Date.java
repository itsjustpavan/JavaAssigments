package com.capgemini;

public class Date 
{
	private int day;
	private int month;
	private int year;
	
		
	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	

	public Date() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	
	{
		return day+"/"+month+"/"+year;
	}

	public boolean isSmaller(Date date)
	
	{
		Date compareDate=new Date(11,12,2018);
		if(date.day<compareDate.day)
		{
			return true;
		}
		else
		{
			return false;

		}
	}
	
	public int[] differenceOfDate(Date date)
	
	{
		Date compareDate=new Date(11,12,2018);
		int newDate = compareDate.day - date.day;
		int newMonth= compareDate.month- date.month;
		int newYear= compareDate.year-date.year;
		int [] differenceOfDate= {newDate , newMonth , newYear};
		return differenceOfDate;
		
	}
}
