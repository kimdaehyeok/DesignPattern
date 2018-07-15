package com.example.designpattern.decoratorpattern.decorator.impli;

import com.example.designpattern.decoratorpattern.decorator.abstracts.ShapeDecorator;
import com.example.designpattern.decoratorpattern.shape.interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator 
{
	public RedShapeDecorator(Shape decoratedShape) 
	{
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	public void draw()
	{
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	 private void setRedBorder(Shape decoratedShape)
	 {
	      System.out.println("Border Color: Red");
	 }
}
