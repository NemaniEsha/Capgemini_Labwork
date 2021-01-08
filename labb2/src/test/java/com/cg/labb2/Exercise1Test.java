package com.cg.labb2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Exercise1Test 
{
    /**
     * Rigorous Test :-)
     */
	private Exercise1 exercise1;
	public void setup()
	{
		exercise1=new Exercise1();
	}
    @Test
    public void second_smallesttest_GivenEmptyArray_ShouldReturn0()
    {
        int numbers[]= {};
        int results=Exercise1.getsecondsmallest(numbers);
        assertEquals(0,results);
    }
    public void second_smallesttest_Given2elementsinArray_ShouldReturnsecondsmallest()
    {
        int numbers[]= {6,3};
        int results=Exercise1.getsecondsmallest(numbers);
        assertEquals(6,results);
    }
    public void second_smallesttest_Given3elementsinArray_ShouldReturnsecondsmallest()
    {
        int numbers[]= {7,1,5};
        int results=Exercise1.getsecondsmallest(numbers);
        assertEquals(5,results);
    }
    
}
