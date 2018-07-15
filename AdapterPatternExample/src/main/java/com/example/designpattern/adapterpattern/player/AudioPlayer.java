package com.example.designpattern.adapterpattern.player;

import com.example.designpattern.adapterpattern.adapter.MediaAdapter;
import com.example.designpattern.adapterpattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer 
{
	private MediaAdapter mediaAdapter;

	public void play(String audioType, String fileName) 
	{
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("mp3")) 
		{
			System.out.println("Playing mp3 file. Name: " + fileName);
		}

		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) 
		{
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		else 
		{
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}
