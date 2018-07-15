package com.example.designpattern.adapterpattern.impli;

import com.example.designpattern.adapterpattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer 
{
	public void playVlc(String fileName) 
	{
		// TODO Auto-generated method stub
		
	}

	public void playMp4(String fileName) 
	{
		// TODO Auto-generated method stub
		System.out.println("Playing Mp4 File : " + fileName);
	}
}
