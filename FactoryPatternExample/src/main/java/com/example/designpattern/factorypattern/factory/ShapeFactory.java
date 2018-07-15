package com.example.designpattern.factorypattern.factory;

import com.example.designpattern.factorypattern.impli.Circle;
import com.example.designpattern.factorypattern.impli.Rectangle;
import com.example.designpattern.factorypattern.impli.Square;
import com.example.designpattern.factorypattern.interfaces.Shape;

public class ShapeFactory 
{
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		
		else if (shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
	         return new Square();
        }
	      
	     return null;
	}
}
