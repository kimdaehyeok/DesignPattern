package com.example.designpattern.abstractfactorypattern.factory;

import com.example.designpattern.abstractfactorypattern.color.interfaces.Color;
import com.example.designpattern.abstractfactorypattern.shape.impli.Circle;
import com.example.designpattern.abstractfactorypattern.shape.impli.Rectangle;
import com.example.designpattern.abstractfactorypattern.shape.impli.Square;
import com.example.designpattern.abstractfactorypattern.shape.interfaces.Shape;

public class ShapeFactory extends AbstractFactory 
{
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		else if (shape.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
