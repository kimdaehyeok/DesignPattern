package com.example.designpattern.decoratorpattern.main;

import com.example.designpattern.decoratorpattern.decorator.impli.RedShapeDecorator;
import com.example.designpattern.decoratorpattern.shape.impli.Circle;
import com.example.designpattern.decoratorpattern.shape.impli.Rectangle;
import com.example.designpattern.decoratorpattern.shape.interfaces.Shape;

/* 객체의 추가적인 요건을 동적으로 추가하기 위해 사용한다.
 * 즉, 클래스 기능의 동적인 추가를 가능하게 하는 구조이다.
 * 어댑터 패턴과도 비슷한데, 어댑터 패턴은 기존의 인터페이스가 아닌 새로운 인터페이스를 제공하지만
 * 데코레이터 패턴은 기존에 인터페이스에 새로운 인터페이스를 추가하거나 기존의 API를 변경하는 방식이다.
 * */
public class DecoratorPatternDemo 
{
	public static void main(String[] args) 
	{
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
