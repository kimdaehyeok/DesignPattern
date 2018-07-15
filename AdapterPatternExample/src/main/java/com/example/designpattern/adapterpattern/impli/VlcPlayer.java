package com.example.designpattern.adapterpattern.impli;

import com.example.designpattern.adapterpattern.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer 
{
	public void playVlc(String fileName) 
	{
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file : " + fileName);
	}

	public void playMp4(String fileName) 
	{
		// TODO Auto-generated method stub
	}
}
