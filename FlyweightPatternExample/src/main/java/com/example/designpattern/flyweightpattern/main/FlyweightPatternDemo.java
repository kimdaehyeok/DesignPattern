package com.example.designpattern.flyweightpattern.main;

import com.example.designpattern.flyweightpattern.factory.ShapeFactory;
import com.example.designpattern.flyweightpattern.impli.Circle;

/* 객체가 없다면 생성하여 리턴하고, 있다면 생성되어 있는 객체를 공유하는 것이다.
 * 이렇게 하기 위해서 대부분 팩토리 패턴을 사용한다.
 * 기존에 있는 객체를 참조하는 방식을 사용하여 각 객체를 생성하는 메모리를 줄일 수 있으며, 객체를 생성하는 시간도 줄일 수 있다.
 * */

public class FlyweightPatternDemo
{
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args)
	{
		for (int i = 0; i < 20; ++i)
		{
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() 
	{
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX()
	{
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() 
	{
		return (int) (Math.random() * 100);
	}
}
