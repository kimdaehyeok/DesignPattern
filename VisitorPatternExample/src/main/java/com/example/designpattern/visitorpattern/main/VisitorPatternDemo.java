package com.example.designpattern.visitorpattern.main;

import com.example.designpattern.visitorpattern.computer.impli.Computer;
import com.example.designpattern.visitorpattern.computer.interfaces.ComputerPart;
import com.example.designpattern.visitorpattern.visitor.impli.ComputerPartDisplayVisitor;

/* 분리되어 있거나 관련없는 객체들을 엮을 때 사용한다.
 * 서로 다른 기능을 구현한 코드가 섞여 있거나, 새로운 기능 추가 시 모든 클래스에 수정이 발생할 때 사용한다.
 * 하나의 기능이 여러 클래스에 분산되어 구현되어 있거나, 기능이 추가될 때마다 개별 클래스를 변경해야 할때 사용한다.
 * 구조를 수정하지 않고, 기존 클래스에 영향을 주지 않으면서 독립적으로 기능을 추가 할 수 있다.
 * */

public class VisitorPatternDemo 
{
	public static void main(String[] args) 
	{
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}