package com.example.designpattern.flyweightpattern.factory;

import java.util.HashMap;

import com.example.designpattern.flyweightpattern.impli.Circle;
import com.example.designpattern.flyweightpattern.interfaces.Shape;

public class ShapeFactory 
{
	private static final HashMap circleMap = new HashMap();
	
	public static Shape getCircle(String color)
	{
		Circle circle = (Circle) circleMap.get(color);
		
		if(circle == null)
		{
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		
		return circle;
	}
}
