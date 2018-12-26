package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest 
{
	private Vehicle vehicle;
	
	@Before
	
	public void beforeFunction()
	{
		vehicle=new Vehicle();
		vehicle.setSpeed(180);
		vehicle.setDirection(0);
		vehicle.setOwnerName("pavan");
				
	}
	@Test
	public void detailsOfVehicle()
	{
		assertEquals("Vehicle [speed=180, directionInDegrees=0, ownerName=pavan]",vehicle.toString());
	}
	
	@Test
	
	public void checkingHighestVehicleIdNumber()
	{
		assertEquals(1000,vehicle.displayVehicleIdNumber());
	}
	
	@Test
	
	public void testingChangeSpeed()
	{
		assertEquals(200,vehicle.changeSpeed(20));
	}

	@Test
	
	public void testingNoSpeed()
	{
		assertEquals(0,vehicle.stopSpeed());
	}
	@Test
	
	public void testingcurrentSpeed()
	{
		assertEquals(180,vehicle.currentSpeed());
	}
	@Test
	public void changeDirectiontest()
	{
		assertEquals("south",vehicle.turnsByDegrees(180,true));
	}
	
	@Test
	public void changeDirectiontestTwo()
	{
		assertEquals("east",vehicle.turnsByDegrees(90,true));
	}
}
