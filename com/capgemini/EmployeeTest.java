package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



	public class EmployeeTest 
	{
		private Employee employee;
		private Employee employeeOne;

		@Before
		
		public void beforeFunction()
		{
			employee =  new Employee(583,"Pavan",5000);
			employeeOne = new Employee(584,"nikhil",500000);	
			Employee.setPfRate(10);
		}
		
		@Test
		
		public void annualBasic() 
		{
			float annualBasic=employee.getAnnualBasic();
			float annualBasic1=employeeOne.getAnnualBasic();
			assertEquals(60000,annualBasic,00);
			assertEquals(6000000,annualBasic1,00);
			
		}
		@Test
		
		public void hra() 
		{
			float hra = employee.hraCalculation();
			float hr1One = employeeOne.hraCalculation();
			assertEquals(4550, hra,00);
			assertEquals(252050, hr1One,00);
		}
		
		@Test
		
		public void monthlyGross() 
		{
			float monthlyGross=employee.getMonthlyGrossSalary();
			float monthlyGross1=employeeOne.getMonthlyGrossSalary();
			assertEquals(11600,monthlyGross,00);
			assertEquals(754100,monthlyGross1,00);
		}
		
		@Test
		
		public void annualGross() 
		{
			float annualGross=employee.getAnnualGrossSalary();	
			float annualGross1=employeeOne.getAnnualGrossSalary();	
			assertEquals(139200,annualGross,00);
			assertEquals(9049200,annualGross1,00);
		}
		
		@Test
		
		public void pfCalculations() 
		{
			float pfCalculations=employee.pf();	
			float pfCalculations1=employeeOne.pf();	
			assertEquals(6500,pfCalculations,00);
			assertEquals(50000,pfCalculations1,00);
		}
		
		@Test
		
		public void esicCalculations() 
		{
			float esicCalculations=employee.esic();
			float esicCalculations1=employeeOne.esic();
			assertEquals(5000,esicCalculations,00);
			assertEquals(23750,esicCalculations1,00);
		}
		
		@Test
		
		public void tax () 
		{
			float tax =employee.proffessionalTax();	
			float tax1 =employeeOne.proffessionalTax();	
			assertEquals(100,tax,00);
			assertEquals(100,tax1,00);
		}
		
		@Test
		
		public void monthlyDeductions() 
		{
			float monthlyDeductions=employee.getMonthlyDeductions();
			float monthlyDeductions1=employeeOne.getMonthlyDeductions();
			assertEquals(11600,monthlyDeductions,00);
			assertEquals(73850,monthlyDeductions1,00);
		}
		@Test
		public void monthlyTakeHome() 
		{
			float monthlyTakeHome =employee.getMonthlyTakeHome();
			float monthlyTakeHome1 =employeeOne.getMonthlyTakeHome();
			assertEquals(0,monthlyTakeHome,00);
			assertEquals(680250,monthlyTakeHome1,00);
		}
		
		@Test
		
		public void annualTakeHome() 
		{
			float annualTakeHome=employee.getAnnualTakeHome();
			float annualTakeHome1=employeeOne.getAnnualTakeHome();
			assertEquals(8163000,annualTakeHome1,00);
		}
		
		@Test
		
		public void setGetPfTest() 
		{
			float setGetPfTest=employeeOne.setGetPf();
			assertEquals(50000,setGetPfTest,00);
		}
		
	}
