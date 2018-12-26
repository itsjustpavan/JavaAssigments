package com.BasicCollection;

public class ClassStudentsCollection 
{
	String firstname;
	String lastname;
	int id;
	public ClassStudentsCollection(String firstname, String lastname, int id) 
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}
	
	@Override
	
	public String toString() 
	{
		return "ClassStudentsCollection [firstname=" + firstname
				+ ", lastname=" + lastname + ", id=" + id + "]";
	}
	
}
