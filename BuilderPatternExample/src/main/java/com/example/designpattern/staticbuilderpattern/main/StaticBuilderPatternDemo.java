package com.example.designpattern.staticbuilderpattern.main;

import com.example.designpattern.staticbuilderpattern.impli.Student;

/* 생성자로 너무 많은 인자가 전달되는 경우 어떠한 인자가 어떤 값을 나타내는지 구분하기 힘들다.
 * 또한 특정 인스턴스인 경우 특정 값만으로 객체를 생성할 경우도 있다. (특정 인자를 Null로 해야 하는데, 이럴 경우 가독성이 떨어진다.)
 * 즉, 각기 다른 능력을 지닌 concreate 객체를 생성하는데 있어서 통일 된 방식을 제공하는 것이다.
 * */

public class StaticBuilderPatternDemo
{
	public static void main(String[] args) 
	{
		Student student = new Student.Builder(143072, "kdh").major("BuilderPattern").age(25).address("seoul").build();

		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getAddress());
	}
}
