package com.example.designpattern.nullobjectpattern.factory;

import com.example.designpattern.nullobjectpattern.abstracts.AbstractCustomer;
import com.example.designpattern.nullobjectpattern.impli.NullCustomer;
import com.example.designpattern.nullobjectpattern.impli.RealCustomer;

public class CustomerFactory 
{
	public static final String[] names = { "Rob", "Joe", "Julie" };

	public static AbstractCustomer getCustomer(String name) 
	{

		for (int i = 0; i < names.length; i++) 
		{
			if (names[i].equalsIgnoreCase(name))
			{
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}