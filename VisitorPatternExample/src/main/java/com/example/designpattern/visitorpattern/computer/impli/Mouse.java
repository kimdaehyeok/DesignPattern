package com.example.designpattern.visitorpattern.computer.impli;

import com.example.designpattern.visitorpattern.computer.interfaces.ComputerPart;
import com.example.designpattern.visitorpattern.visitor.interfaces.ComputerPartVisitor;

public class Mouse implements ComputerPart 
{
	public void accept(ComputerPartVisitor computerPartVisitor) 
	{
		computerPartVisitor.visit(this);
	}
}