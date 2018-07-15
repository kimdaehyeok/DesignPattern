package com.example.designpattern.singleton;

public class SingletonObject 
{
	private static SingletonObject instance;
	
	private SingletonObject()
	{
		
	}
	
	public static SingletonObject getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonObject();
		}
		
		return instance;
	}
	
	public void showMessage()
	{
		System.out.println("Hello World");
	}
}
