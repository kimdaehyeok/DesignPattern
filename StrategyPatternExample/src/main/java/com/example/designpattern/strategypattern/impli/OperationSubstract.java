package com.example.designpattern.strategypattern.impli;

import com.example.designpattern.strategypattern.interfaces.Strategy;

public class OperationSubstract implements Strategy 
{
	public int doOperation(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		return num1 - num2;
	}
}
