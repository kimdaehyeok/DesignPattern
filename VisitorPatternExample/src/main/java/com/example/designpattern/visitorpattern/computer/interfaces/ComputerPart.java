package com.example.designpattern.visitorpattern.computer.interfaces;

import com.example.designpattern.visitorpattern.visitor.interfaces.ComputerPartVisitor;

public interface ComputerPart 
{
   public void accept(ComputerPartVisitor computerPartVisitor);
}