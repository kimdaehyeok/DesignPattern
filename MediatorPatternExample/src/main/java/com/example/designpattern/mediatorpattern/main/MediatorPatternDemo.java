package com.example.designpattern.mediatorpattern.main;

import com.example.designpattern.mediatorpattern.classes.User;

/* 서로 다른 객체간에 상호 통신이 매우 복잡할 때 중재자를 통해 객체간의 통신을 가능하도록 하는 것이다.
 * 두 객체를 직접 연결을 하지 않고 제 3의 객체를 통해 느슨하게 연결하는 것이다.
 * */

/* 대표적으로 JMS(Java Message Server)에 많이 사용된다.
 * JMS는 중간에 JMS 서버를 두고 message를 받는 쪽은 subscribt, 보내는 쪽은 publication 방식으로
 * 메시지를 주고 받을 수 있다. 즉 Sender - JMS - Receiver를 통한 통신이 가능하다.
 * */

public class MediatorPatternDemo 
{
	public static void main(String[] args) 
	{
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
