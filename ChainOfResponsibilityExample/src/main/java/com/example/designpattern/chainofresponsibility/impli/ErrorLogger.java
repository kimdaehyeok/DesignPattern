package com.example.designpattern.chainofresponsibility.impli;

import com.example.designpattern.chainofresponsibility.abstracts.AbstractLogger;

public class ErrorLogger extends AbstractLogger 
{

	public ErrorLogger(int level) 
	{
		this.level = level;
	}

	@Override
	protected void write(String message)
	{
		System.out.println("Error Console::Logger: " + message);
	}
}