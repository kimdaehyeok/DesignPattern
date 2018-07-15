package com.example.designpattern.chainofresponsibility.impli;

import com.example.designpattern.chainofresponsibility.abstracts.AbstractLogger;

public class FileLogger extends AbstractLogger
{
	public FileLogger(int level)
	{
		this.level = level;
	}

	@Override
	protected void write(String message) 
	{
		System.out.println("File::Logger: " + message);
	}
}