package com.example.designpattern.builderpattern.burger;

import com.example.designpattern.builderpattern.interfaces.Item;
import com.example.designpattern.builderpattern.interfaces.Packing;
import com.example.designpattern.builderpattern.wrapper.Wrapper;

public abstract class Burger implements Item
{
	public Packing packing()
	{
		return new Wrapper();
	}
}
