package com.example.designpattern.nullobjectpattern.main;

import com.example.designpattern.nullobjectpattern.abstracts.AbstractCustomer;
import com.example.designpattern.nullobjectpattern.factory.CustomerFactory;

/* 일반적으로 객체가 존재하지 않는 경우를 처리 하기 위해
 * if(ref == null) 또는 try catch문을 사용하여 예외 처리를 한다.
 * Null Object 패턴은 빈 객체를 기본적으로 제공함으로서 예외 처리를 사전에 피할 수 있는 패턴이다.
 * 
 * 클라이언트 코드에서 널값을 비교하는 구문을 최소화 할 수 있으며 프로그램 안정성을 높일 수 있는 장점이 있다.
 * 널 객체를 요구하는 클래스마다 인터페이스 선언 및 구현의 단점이 있다.
 * */
public class NullPatternDemo 
{
	public static void main(String[] args)
	{
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
