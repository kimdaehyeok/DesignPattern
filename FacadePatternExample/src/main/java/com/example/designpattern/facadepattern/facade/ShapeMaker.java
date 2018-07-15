package com.example.designpattern.facadepattern.facade;

import com.example.designpattern.facadepattern.impli.Circle;
import com.example.designpattern.facadepattern.impli.Rectangle;
import com.example.designpattern.facadepattern.impli.Square;
import com.example.designpattern.facadepattern.interfaces.Shape;

public class ShapeMaker 
{
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() 
	{
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() 
	{
		circle.draw();
	}

	public void drawRectangle() 
	{
		rectangle.draw();
	}

	public void drawSquare() 
	{
		square.draw();
	}
}
