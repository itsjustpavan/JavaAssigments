package com.capgemini;

public class EmployeeFile {
	int id;
	String name;
	float salary;

	public EmployeeFile(int id, String name, float salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "EmployeeFile [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}

}
