package com.example.designpattern.prototypepattern.impli;

import com.example.designpattern.prototypepattern.abstracts.Shape;

public class Circle extends Shape 
{
	public Circle() 
	{
		type = "Circle";
	}

	@Override
	public void draw() 
	{
		System.out.println("Inside Circle::draw() method.");
	}
}