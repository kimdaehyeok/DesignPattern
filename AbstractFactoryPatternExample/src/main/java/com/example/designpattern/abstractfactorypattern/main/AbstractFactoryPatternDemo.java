package com.example.designpattern.abstractfactorypattern.main;

import com.example.designpattern.abstractfactorypattern.color.interfaces.Color;
import com.example.designpattern.abstractfactorypattern.factory.AbstractFactory;
import com.example.designpattern.abstractfactorypattern.factory.FactoryProducer;
import com.example.designpattern.abstractfactorypattern.shape.interfaces.Shape;

public class AbstractFactoryPatternDemo 
{
	/* 여러 제품군 중 하나를 선택해서 시스템을 설정하야 하고 한번 구성한 제품을 다른 것으로 대체할 수 있을 때 사용
     * 관련된 제품 객체들이 함께 사용되도록 설계되었고, 이 부분에 대한 제약이 외부에도 지켜지도록 하고 싶을 때 사용
     * 여러개의 객체로 구성된 객체에서 각 객체에 대한 다양한 하위 객체가 있을 때 사용
	 * */
	
	public static void main(String[] args) 
	{
		AbstractFactory shapeAbstractFactory = FactoryProducer.getFactory("Shape");
		AbstractFactory colorAbstractFactory = FactoryProducer.getFactory("COLOR");
		
		Shape circle = shapeAbstractFactory.getShape("Circle");
		circle.draw();
		
		Color red = colorAbstractFactory.getColor("Red");
		red.fill();
		
	}
}
