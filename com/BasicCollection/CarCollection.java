package com.BasicCollection;

public class CarCollection 
{
	String make;
	int model;
	int year;
	float price;
	public CarCollection(String make, int model, int i, float price)                                     //Constructor having four fields
	{
		super();
		this.make = make;
		this.model = model;
		this.year = i;
		this.price = price;
	}
	@Override
	
	public String toString()                                                                            //ToString method
	{
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}
	
	@Override
	
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
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
		CarCollection other = (CarCollection) obj;
		if (make == null) 
		{
			if (other.make != null)
				return false;
		} 
		else if (!make.equals(other.make))
			return false;
		if (model != other.model)
			return false;
		return true;
	}
	
	public String getMake() 
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
		
}


