package com.example.designpattern.adapterpattern.adapter;

import com.example.designpattern.adapterpattern.impli.Mp4Player;
import com.example.designpattern.adapterpattern.impli.VlcPlayer;
import com.example.designpattern.adapterpattern.interfaces.AdvancedMediaPlayer;
import com.example.designpattern.adapterpattern.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer 
{
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			advancedMediaPlayer = new VlcPlayer();
		}
		
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedMediaPlayer = new Mp4Player();
		}
	}
	
	public void play(String audioType, String fileName) 
	{
		// TODO Auto-generated method stub
	    if(audioType.equalsIgnoreCase("vlc"))
	    {
	    	advancedMediaPlayer.playVlc(fileName);
	    }
	    else if(audioType.equalsIgnoreCase("mp4"))
	    {
	    	advancedMediaPlayer.playMp4(fileName);
	    }
	}
}
