package com.example.designpattern.commandpattern.main;

import com.example.designpattern.commandpattern.broker.Broker;
import com.example.designpattern.commandpattern.impli.BuyStock;
import com.example.designpattern.commandpattern.impli.SellStock;
import com.example.designpattern.commandpattern.processing.Stock;

/* 객체는 그 객체가 행동할 것에 대한 메소드를 가지고 있다.
 * 커맨드 패턴은 객체가 가지고 있는 메소드 하나하나를 클래스로 분리하는 방식이다.
 * 메소드를 클래스화 한다면 객체의 행위에 대해 undo, redo, logging 등 다양한 조작을 할 수 있다.
 * 메소드를 동적으로 바인딩 하는 것은 전략패턴과 비슷해 보이지만
 * 전략 패턴은 다양한 전략을 설정하는 반면, 커맨드 패턴은 단일 행위에 집중하며
 * 그 단일 행위에 대한 사전/사후 동작들을 정의하는 방법이다.
 * */

/* 커맨드 패턴에서 사용되는 객체의 종류
 * 클라이언트 : 요청을 주는 객체
 * 인보커 객체 : 요청을 받아서 수행하도록 지시하는 객체
 * 커맨드 객체 : 요청에 대한 내용
 * 리시버 객체 : 요청을 받아 수행하는 객체
 * */

public class CommandPatternDemo 
{
	public static void main(String[] args) 
	{
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
