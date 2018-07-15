package com.example.designpattern.abstractfactorypattern.factory;

import com.example.designpattern.abstractfactorypattern.color.impli.Blue;
import com.example.designpattern.abstractfactorypattern.color.impli.Green;
import com.example.designpattern.abstractfactorypattern.color.impli.Red;
import com.example.designpattern.abstractfactorypattern.color.interfaces.Color;
import com.example.designpattern.abstractfactorypattern.shape.interfaces.Shape;

public class ColorFactory extends AbstractFactory 
{
	@Override
	public Shape getShape(String shape) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) 
	{
		// TODO Auto-generated method stub
		if(color.equalsIgnoreCase("Red"))
		{
			return new Red();
		}
		else if(color.equalsIgnoreCase("Green"))
		{
			return new Green();
		}
		else if(color.equalsIgnoreCase("Bule"))
		{
			return new Blue();
		}
		return null;
	}
}
