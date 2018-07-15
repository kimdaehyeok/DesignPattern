package com.example.designpattern.abstractfactorypattern.factory;

import com.example.designpattern.abstractfactorypattern.color.interfaces.Color;
import com.example.designpattern.abstractfactorypattern.shape.interfaces.Shape;

public abstract class AbstractFactory 
{
	abstract public Shape getShape(String shape);
	abstract public Color getColor(String color);
}
