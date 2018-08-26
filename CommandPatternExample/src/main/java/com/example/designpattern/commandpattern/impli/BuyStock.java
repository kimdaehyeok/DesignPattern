package com.example.designpattern.commandpattern.impli;

import com.example.designpattern.commandpattern.interfaces.Order;
import com.example.designpattern.commandpattern.processing.Stock;

public class BuyStock implements Order 
{
	private Stock abcStock;

	public BuyStock(Stock abcStock) 
	{
		this.abcStock = abcStock;
	}

	public void execute() 
	{
		abcStock.buy();
	}
}