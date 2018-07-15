package com.example.designpattern.templatepattern.main;

import com.example.designpattern.templatepattern.impli.Cricket;
import com.example.designpattern.templatepattern.impli.Football;
import com.example.designpattern.templatepattern.template.Game;

/* 상위 클래스에서 처리의 흐름을 제어하며, 하위클래스에서 처리의 내용을 구체화한다.
 * 여러 클래스에 공통되는 사항은 상위 추상 클래스에서 구현하고, 각각의 상세부분은 하위 클래스에서 구현한다.
 * 코드의 중복을 줄이고, Refactoring에 유리한 패턴으로 상속을 통한 확장 개발 방법으로써 전략 패턴(Strategy Pattern)과 함께 가장 많이 사용되는 패턴중에 하나이다.
 * 공통인 부분은 template에서 구현할 수도 있다.
 * */

public class TemplatePatternDemo 
{
	public static void main(String[] args) 
	{
		Game game = new Cricket();
		game.play();
		
		game = new Football();
		game.play();
	}
}
