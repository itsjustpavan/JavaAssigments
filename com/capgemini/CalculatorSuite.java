package com.capgemini;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AdditionTesting.class,
	SubtractionTesting.class,
	MultiplicationTesting.class,
	DivisionTesting.class 

})
public class CalculatorSuite {

}
