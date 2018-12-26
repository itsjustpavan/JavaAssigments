package com.BasicCollection;
public class Cellphone 
{
	String company;
	int model;
	String description;
	String operatingSystem;
	 float price;
	
	public Cellphone(String company, int model, String description,                                                   //Constructor having four fields
			String operatingSystem, float price) 
	{
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	
	@Override
	
	public String toString()                                                                                         //ToString method
	{
		return "Cellphone [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatingSystem="
				+ operatingSystem + ", price=" + price + "]";
	}

	@Override
	public int hashCode()                                                                                            //Hashcode method
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
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
		Cellphone other = (Cellphone) obj;
		if (company == null) 
		{
			if (other.company != null)
				return false;
		} 
		else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		if (operatingSystem == null) 
		{
			if (other.operatingSystem != null)
				return false;
		} 
		else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}
	
}