package com.example.designpattern.strategypattern.impli;

import com.example.designpattern.strategypattern.interfaces.Strategy;

public class OperationAdd implements Strategy 
{
	public int doOperation(int num1, int num2) 
	{
		return num1 + num2;
	}

}
