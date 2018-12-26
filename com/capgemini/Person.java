package com.capgemini;

public class Person 
{
	private String name; 					       // data member to store the name of a person.
	private Date dob; 						      // data member to store the date of birth of a person.
	private Localdate localdate;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Date getDob() 
	{
		return dob;
	}
	public void setDob(Date dob) 
	{
		this.dob = dob;
	}
										
	public Person(String name, int date, int month, int year) 		
	{
		this.name=name;
		this.date=date;
		this.month=month;
		this.year=year;
		//constructor to initialize Person objects
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}
	public void olderOne
}
