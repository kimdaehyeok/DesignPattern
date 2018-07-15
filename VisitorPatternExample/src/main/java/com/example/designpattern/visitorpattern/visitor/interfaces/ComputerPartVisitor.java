package com.example.designpattern.visitorpattern.visitor.interfaces;

import com.example.designpattern.visitorpattern.computer.impli.Computer;
import com.example.designpattern.visitorpattern.computer.impli.Keyboard;
import com.example.designpattern.visitorpattern.computer.impli.Monitor;
import com.example.designpattern.visitorpattern.computer.impli.Mouse;

public interface ComputerPartVisitor 
{
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
