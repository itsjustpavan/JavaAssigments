package com.capgemini;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelivisionTest 
{

	private Telivision telivisionInstance;

	@Before
	
	public void beforeFunction()
	{
		telivisionInstance=new Telivision(true,100);	
	}
	
	@Test
	public void stateTest()
	{
		assertEquals(true,telivisionInstance.checkState());
		
	}
	
	@Test
	
	public void increaseVolumeTest()
	{
		assertEquals(1,telivisionInstance.increaseVolume());
		
	}
	
	@Test
	
	public void decreaseVolumeTest()
	{
		assertEquals(0,telivisionInstance.decreaseVolume());
		
	}
	
	@Test
	
	public void currentChannelTest()
	{
		assertEquals(100,telivisionInstance.currentChannel());
		
	}
	
	@Test
	
	public void increaseChannelTest()
	{
		assertEquals(101,telivisionInstance.increaseChannel());
		
	}

	@Test
	
	public void currentTelivisionTest()
	{
		assertEquals(false,telivisionInstance.changeState());
		
	}
}
