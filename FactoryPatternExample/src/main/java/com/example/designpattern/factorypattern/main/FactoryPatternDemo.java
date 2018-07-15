package com.example.designpattern.factorypattern.main;

import com.example.designpattern.factorypattern.factory.ShapeFactory;
import com.example.designpattern.factorypattern.interfaces.Shape;

/* 효율적인 객체를 생성하는 일을 전담하도록 한다
 * 인터페이스를 바탕으로 유연성과 확장성이 뛰어난 코드 제작이 가능하다
 * 인터페이스 타입의 객체 생성을 요청하지만, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정한다 
 * 객체 생성 및 사용 부분을 분리할 수 있으며, 객체 생성 코드는 오직 하나의 팩토리에서만 생성해 중복을 방지하고 유지보수가 쉽다.
 * */
public class FactoryPatternDemo 
{
	public static void main(String[] args) 
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Circle");
		Shape shape2 = shapeFactory.getShape("Rectangle");
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
}
