package com.example.designpattern.bridgepattern.main;

import com.example.designpattern.bridgepattern.draw.impli.GreenCircle;
import com.example.designpattern.bridgepattern.draw.impli.RedCircle;
import com.example.designpattern.bridgepattern.shape.abst.Shape;
import com.example.designpattern.bridgepattern.shape.impli.Circle;

/* 객체의 구현부를 비워놓는 클래스를 선언하고, 구현부는 객체의 생성자로 입력 받는 방식이다.
 * */

/* 어앱터(Adapter) 패턴과의 차이점
 * 어댑터 패턴은 기존에 존재하는 대상 객체를 찹조할 수 있는 새로운 인터페이스를 제공하는 것이고
 * 브리지 패턴은 기존에 존재하는 객체의 참조화는 관련이 없으며, 객체의 범용성을 증가시키기 위해 
 * 구현부를 비워놓고 객체의 생성 시에 구현부를 입력받는 방식이다.
 * */

/* 전략(Strategy) 패턴과의 차이점
 * 전략패턴은 생성시점이 아닌 동작 시점에서 행동방식 변경에 초점이 맞춰저 있다.
 * 객체는 언제는지 행동 객체의 입력에 따라 그 동작이 변경될 수 있다.
 * 반면에, 브리지 패턴은 생성 시점에 초점이 맞춰져 있다. 
 * */

public class BridgePatternDemo 
{
	public static void main(String[] args) 
	{
		Shape redCircle = new Circle(100,100,0,new RedCircle());
		Shape greenCircle = new Circle(100,100,0, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}
