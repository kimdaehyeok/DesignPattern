package com.example.designpattern.bridgepattern.shape.abst;

import com.example.designpattern.bridgepattern.draw.interfaces.DrawAPI;

public abstract class Shape 
{
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI)
	{
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
