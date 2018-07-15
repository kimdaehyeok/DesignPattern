package com.example.designpattern.builderpattern.drink;

import com.example.designpattern.builderpattern.bottle.Bottle;
import com.example.designpattern.builderpattern.interfaces.Item;
import com.example.designpattern.builderpattern.interfaces.Packing;

public abstract class ColdDrink implements Item
{
	public Packing packing()
	{
		return new Bottle();
	}
}
