package com.example.designpattern.bridgepattern.shape.impli;

import com.example.designpattern.bridgepattern.draw.interfaces.DrawAPI;
import com.example.designpattern.bridgepattern.shape.abst.Shape;

public class Circle extends Shape 
{
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) 
	{
		// TODO Auto-generated constructor stub
		super(drawAPI);
		
	    this.x = x;  
	    this.y = y;  
	    this.radius = radius;
	}

	@Override
	public void draw() 
	{
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}
}
