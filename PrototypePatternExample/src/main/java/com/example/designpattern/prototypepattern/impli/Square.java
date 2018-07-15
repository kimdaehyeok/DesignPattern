package com.example.designpattern.prototypepattern.impli;

import com.example.designpattern.prototypepattern.abstracts.Shape;

public class Square extends Shape
{
	public Square() 
	{
		type = "Square";
	}

	@Override
	public void draw() 
	{
		System.out.println("Inside Square::draw() method.");
	}
}