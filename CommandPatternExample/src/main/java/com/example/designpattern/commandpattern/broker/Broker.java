package com.example.designpattern.commandpattern.broker;

import java.util.ArrayList;
import java.util.List;

import com.example.designpattern.commandpattern.interfaces.Order;

/* It is an invoker object */
public class Broker 
{
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order)
	{
		orderList.add(order);
	}
	
	public void placeOrders()
	{
		for(Order order : orderList)
		{
			order.execute();
		}
		
		orderList.clear();
	}
}
