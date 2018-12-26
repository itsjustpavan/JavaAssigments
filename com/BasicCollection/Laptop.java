package com.BasicCollection;

public class Laptop 
{
	String company;
	int model;
	String operatingsystem;
	String processor;

	public Laptop(String company, int model, String operatingsystem,                                       //Constructor having four fields
			String processor) 
	{
		super();
		this.company = company;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.processor = processor;
	}

	@Override
	
	public int hashCode()                                                                                  //Getting hashcode method
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
		return result;
	}

	@Override
	
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		return true;
	}


	@Override
	public String toString()                                                                                //Generating toString method
	{
		return "Laptop [company=" + company + ", model=" + model
				+ ", operatingsystem=" + operatingsystem + ", processor="
				+ processor + "]";
	}

}

