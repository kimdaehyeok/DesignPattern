package com.example.designpattern.decoratorpattern.decorator.abstracts;

import com.example.designpattern.decoratorpattern.shape.interfaces.Shape;

public abstract class ShapeDecorator implements Shape 
{
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape)
	{
		this.decoratedShape = decoratedShape;
	}
	
	public void draw()
	{
		decoratedShape.draw();
	}
}
