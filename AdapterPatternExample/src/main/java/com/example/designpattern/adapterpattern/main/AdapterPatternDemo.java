package com.example.designpattern.adapterpattern.main;

import com.example.designpattern.adapterpattern.player.AudioPlayer;

/* 서로 다르게 구현된 인터페이스를 사용하고자 하는 다른 인터페이스로 변환한다.
 * 즉, A와 B의 인터페이스가 다를 경우 A에 맞추던가 B에 맞추던가 두개의 인터페이스를 통일시켜 사용하게 하는 구조이다
 * 서로 다르게 구현된 것을 하나의 패턴으로 일치시켜주는 것 뿐이다.
 * 아답터 패턴은 객체를 내부에 선언 사용하는 객체 아답터 패턴과 인터페이스를 상속받아 사용하는 클래스 아답터 패턴으로 나뉜다
 * */

public class AdapterPatternDemo 
{
	public static void main(String[] args) 
	{
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}