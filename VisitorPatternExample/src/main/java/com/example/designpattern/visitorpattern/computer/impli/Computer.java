package com.example.designpattern.visitorpattern.computer.impli;

import com.example.designpattern.visitorpattern.computer.interfaces.ComputerPart;
import com.example.designpattern.visitorpattern.visitor.interfaces.ComputerPartVisitor;

public class Computer implements ComputerPart 
{
	private ComputerPart[] parts;

	public Computer()
	{
		parts = new ComputerPart[] {  new Mouse(), new Keyboard(), new Monitor() };
	}

	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		// Displaying Mouse.
		// Displaying Keyboard.
		// Displaying Monitor.
		for (int i = 0; i < parts.length; i++) 
		{
			parts[i].accept(computerPartVisitor);
		}

		// Displaying Computer.
		computerPartVisitor.visit(this);
	}
}
