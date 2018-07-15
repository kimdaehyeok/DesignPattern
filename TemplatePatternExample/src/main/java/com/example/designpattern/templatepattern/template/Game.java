package com.example.designpattern.templatepattern.template;

public abstract class Game 
{
	protected abstract void initialize();
	protected abstract void startPlay();
	protected abstract void endPlay();
	
	//Template Method
	public final void play()
	{
		initialize();
		startPlay();
		endPlay();
	}
}
