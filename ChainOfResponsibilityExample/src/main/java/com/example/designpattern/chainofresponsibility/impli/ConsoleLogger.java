package com.example.designpattern.chainofresponsibility.impli;

import com.example.designpattern.chainofresponsibility.abstracts.AbstractLogger;

public class ConsoleLogger extends AbstractLogger 
{
	public ConsoleLogger(int level)
	{
		this.level = level;
	}
	@Override
	protected void write(String message) 
	{
		// TODO Auto-generated method stub
		System.out.println("Standard Console::Logger: " + message);
	}
	
}
