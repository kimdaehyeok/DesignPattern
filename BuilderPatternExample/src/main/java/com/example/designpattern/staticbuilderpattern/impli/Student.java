package com.example.designpattern.staticbuilderpattern.impli;

import com.example.designpattern.staticbuilderpattern.interfaces.Buildable;

public class Student 
{
	private long id;
	private String name;
	
	private String major;
	private int age;
	private String address;

	public static class Builder implements Buildable<Object>
	{
		//Essential Parameter
		private int id;
		private String name;
		
		//Selective Parameter
		private String major = "";
		private int age = 0;
		private String address = "";
		
		// 필수 값은 생성자를 통해 받는다.
		public Builder(int id, String name)
		{
			this.id = id;
			this.name = name;
		}
		
		//선택값은 setter를 통해 세팅한다.
		public Builder major(String major)
		{
			this.major = major;
			return this;
		}
		
		public Builder age(int age)
		{
			this.age = age;
			return this;
		}
		
		public Builder address(String address)
		{
			this.address = address;
			return this;
		}
		
		public Student build() 
		{
			// TODO Auto-generated method stub
			return new Student(this);
		}
	}
	
	private Student(Builder builder)
	{
		this.id = builder.id;
		this.name = builder.name;
		this.major = builder.major;
		this.age = builder.age;
		this.address = builder.address;
	}

	// 데이터 확인
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	
}
