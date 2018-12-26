package com.capgemini;

	public class Complex 
	{
		double real;
		double imaginary;
	
		public Complex()                            //Default Constructor
		{
			
		}
		
		public Complex(double real, double imaginary) 
		{
			this.real = real;
			this.imaginary = imaginary;
		}
		public void display()
		{
			System.out.println(real+"+"+imaginary+"i");
		}
		
		public static Complex sum(Complex complex,Complex complexOne)
		{
			Complex result = new Complex();
			result.real=complex.real+complexOne.real;
			result.imaginary=complex.imaginary+complexOne.imaginary;
			return result;
			
		}

	}

