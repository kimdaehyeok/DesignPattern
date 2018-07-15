package com.example.designpattern.strategypattern.main;

import com.example.designpattern.strategypattern.context.Context;
import com.example.designpattern.strategypattern.impli.OperationAdd;
import com.example.designpattern.strategypattern.impli.OperationMultiply;
import com.example.designpattern.strategypattern.impli.OperationSubstract;

/* 동적으로 알고리즘을 교체할 수 있는 디자인 패턴
 * 알고리즘 인터페이스를 정의하고, 각각의 알고리즘을 클래스별로 캡슐화하여, 각각의 알고리즘을 교체 사용 가능하게 한다
 * 즉, 하나의 결과를 만드는 목적(메소드)은 동일하나, 그 목적을 달성할 수 있는 방법(전략, 알고리즘)이 여러가지가 존재할 경우
 * 기본이 되는 템플릿 메서드(Template Method Pattern) 패턴과 함께 가장 많이 사용되는 패턴 중에 하나이다
 * */

public class StrategyPatternDemo 
{
	public static void main(String[] args) 
	{
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(5, 3));
				
		context = new Context(new OperationSubstract());
		System.out.println(context.executeStrategy(5, 3));
		
		context = new Context(new OperationMultiply());
		System.out.println(context.executeStrategy(5, 3));
	}
}
