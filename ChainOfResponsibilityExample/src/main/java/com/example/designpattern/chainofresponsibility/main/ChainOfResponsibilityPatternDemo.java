package com.example.designpattern.chainofresponsibility.main;

import com.example.designpattern.chainofresponsibility.abstracts.AbstractLogger;
import com.example.designpattern.chainofresponsibility.impli.ConsoleLogger;
import com.example.designpattern.chainofresponsibility.impli.ErrorLogger;
import com.example.designpattern.chainofresponsibility.impli.FileLogger;

/* 하나의 요청에 대한 처리가 반드시 한 객체에서만 되지 않고, 여러 객체에게 그 처리 기회를 주려는 것이 목적이다.
 * 하나 이상의 객체가 요청을 처리해야 하고, 그 요청 처리자 중 어떤 것이 선행자인지 모를때 혹은 처리자가 자동으로 확정되어야 할 때 사용한다.
 * 메시지를 받을 객체를 명시하지 않은 채 여러 객체 중 하나에게 처리를 요청하고 싶을 때 사용한다.
 * 요청을 처리할 수 있는 객체 집합이 동적으로 정의되어야 할 때 사용한다.
 * */
public class ChainOfResponsibilityPatternDemo 
{
	private static AbstractLogger getChainOfLoggers() 
	{
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) 
	{
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println();
		
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		System.out.println();
		
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
		System.out.println();
	}
}
