package com.sm.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import sm.com.service.Arithematic;

public class AppTest 
{
	@Test
	public void cheakWithPostivies()
	{
	Arithematic ac=new Arithematic();
	float expceted=30.0f;
	float actual=ac.sum(10.0f,20.0f);
	assertEquals(expceted,actual,30.0f);
	}
	
	@Test
	public void cheakWithNegetives()
	{
	Arithematic ac=new Arithematic();
	float expceted=-30.0f;
	float actual=ac.sum(-10.0f,-20.0f);
	assertEquals(expceted,actual,-30.0f);
	}
	@Test
	public void cheakWithZeros()
	{
	Arithematic ac=new Arithematic();
	float expceted=0.0f;
	float actual=ac.sum(0.0f,0.0f);
	assertEquals(expceted,actual,0.0f);
	}
	@Test
	public void cheakWithmixedvalues()
	{
	Arithematic ac=new Arithematic();
	float expceted=-10.0f;
	float actual=ac.sum(10.0f,-20.0f);
	assertEquals(expceted,actual,-10);
	}

}
