package com.example.designpattern.compositepattern.main;

import com.example.designpattern.compositepattern.dto.Employee;

/* 객체의 그룹들이 하나의 인스턴스 처럼 다루어 질때 사용
 * 예) 메뉴 -> (카페메뉴 -> A) , (식당메뉴 -> A,B,C), (디저트 메뉴 -> A,B,C) 와 같은 트리 형태
 * 단일객체와 객체의 그룹이 하나의 객체처럼 다루어 질 수 있다.
 * */
public class CompositePatternDemo 
{
	public static void main(String[] args)
	{
		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		System.out.println(CEO);

		for (Employee headEmployee : headSales.getSubordinates()) 
		{
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) 
			{
				System.out.println(employee);
			}
		}
	}
}
