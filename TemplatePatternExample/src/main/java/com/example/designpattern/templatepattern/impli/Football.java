package com.example.designpattern.templatepattern.impli;

import com.example.designpattern.templatepattern.template.Game;

public class Football extends Game 
{
	@Override
	protected void initialize() 
	{
		// TODO Auto-generated method stub
		System.out.println("Football inialize");
	}

	@Override
	protected void startPlay() 
	{
		// TODO Auto-generated method stub
		System.out.println("Football start");
		
	}

	@Override
	protected void endPlay() 
	{
		// TODO Auto-generated method stub
		System.out.println("Football end");
		
	}

}
