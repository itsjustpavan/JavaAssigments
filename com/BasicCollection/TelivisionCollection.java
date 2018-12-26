package com.BasicCollection;

public class TelivisionCollection 
{
	String company;
	String type;
	float price;
	boolean  threeDimensionE0nabled;
	
	public TelivisionCollection(String company, String type, float price,                                              //Constructor having four fields
			boolean threeDimensionE0nabled) 
	{
		super();
		this.company = company;
		this.type = type;
		this.price = price;
		this.threeDimensionE0nabled = threeDimensionE0nabled;
	}

	

	@Override
	public int hashCode()                                                                                         //Hashcode() method
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj)                                                                         //getEquals() method
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelivisionCollection other = (TelivisionCollection) obj;
		if (company == null) 
		{
			if (other.company != null)
				return false;
		} 
		else if (!company.equals(other.company))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (type == null) 
		{
			if (other.type != null)
				return false;
		} 
		else if (!type.equals(other.type))
			return false;
		return true;
	}



	@Override 
	
	public String toString()                                                                                //ToString method
	{
		return "TelivisionCollection [company=" + company + ", type=" + type
				+ ", threeDimensionE0nabled=" + threeDimensionE0nabled
				+ ", price=" + price + "]";
	}
	
}

