package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTestCase
 {

	private Time time;
	private Time time1;
	private Time time2;
	private Time time3;
	@Before
	public void beforeFunction()
	{
		time = new Time(10,20);
		time1 = new Time(12,70);
		time2 = new Time(11,19);
		time3 = new Time(5,60);
	}

	@Test
	public void timeTestFunction()
	{
		String expectedResult="addition of hours cannot be more than 24 hours in a day";
		Time answer = Time.sum(time, time1);
		answer.display();
		assertEquals(expectedResult, "addition of hours cannot be more than 24 hours in a day");
	}
	

	@Test
	public void timeTestfunctionTwo()
	{
		String expectedResult="16 hrs 20 min";
		Time answer = Time.sum(time2, time3);
		answer.display();
		assertEquals(expectedResult,answer.hours+" hrs "+answer.minutes+" min");
	}

 }