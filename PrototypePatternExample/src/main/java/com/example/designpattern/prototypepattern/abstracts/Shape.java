package com.example.designpattern.prototypepattern.abstracts;

public abstract class Shape implements Cloneable {
	
	private String id;
	protected String type;

	public abstract void draw();

	public String getType() 
	{
		return type;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Object clone = null;
		
		clone = super.clone();
		
		return clone;
	}
}
