package com.example.designpattern.templatepattern.impli;

import com.example.designpattern.templatepattern.template.Game;

public class Cricket extends Game 
{
	@Override
	protected void initialize() 
	{
		// TODO Auto-generated method stub
		System.out.println("Cricket inialize");
	}

	@Override
	protected void startPlay() 
	{
		// TODO Auto-generated method stub
		System.out.println("Cricket start");
	}

	@Override
	protected void endPlay() 
	{
		// TODO Auto-generated method stub
		System.out.println("Cricket end");
	}
}
