package com.example.designpattern.singleton;

/* 무분별한 객체생성을 방지하고, 1개의 객체만 생성하여 이용하는 프로그램 코딩에 유용하게 적용할 수 있다.
 **/
public class SingletonDemo 
{
	public static void main(String[] args)
	{
		SingletonObject object = SingletonObject.getInstance();
		
		object.showMessage();
	}
}
