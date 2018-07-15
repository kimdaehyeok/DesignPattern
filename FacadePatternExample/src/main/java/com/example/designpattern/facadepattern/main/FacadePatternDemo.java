package com.example.designpattern.facadepattern.main;

import com.example.designpattern.facadepattern.facade.ShapeMaker;

/* 서브시스템의 다수의 객체를 쉽게 사용하기 위해 사용
 * 서스시스템 간의 복잡한 인터페이스를 단순화된 하나의 인터페이스로 제공하려는 것
 * 즉 서브시스템을 사용하기 쉽게 하기 위한 포괄적 개념의 인터페이스를 정의한다.
 * 복잡한 서브시스템에 대한 단순한 인터페이스를 제공할 필요가 있을 때 유용하다
 * */

public class FacadePatternDemo 
{
	public static void main(String[] args) 
	{
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawRectangle();
	}
}
