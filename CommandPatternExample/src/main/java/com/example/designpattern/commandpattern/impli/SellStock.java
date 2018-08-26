package com.example.designpattern.commandpattern.impli;

import com.example.designpattern.commandpattern.interfaces.Order;
import com.example.designpattern.commandpattern.processing.Stock;

public class SellStock implements Order 
{
	private Stock abcStock;

	public SellStock(Stock abcStock) 
	{
		this.abcStock = abcStock;
	}

	public void execute() 
	{
		abcStock.sell();
	}
}
