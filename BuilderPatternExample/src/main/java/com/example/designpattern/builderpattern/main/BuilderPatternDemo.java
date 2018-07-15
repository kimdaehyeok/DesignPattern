package com.example.designpattern.builderpattern.main;

import com.example.designpattern.builderpattern.builder.MealBuilder;
import com.example.designpattern.builderpattern.meal.Meal;

public class BuilderPatternDemo 
{
	/* 복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴이다.
	 * 또한 객체를 생성할 때 가변적인 매개변수 처리도 가능하다.
	 * 즉, 객체를 생성할때 객체를 이루는 구성요소들을 분리하여 객체의 세부 구성요소의 클래스들을 별도로 만들고 그 구성 요소 클래스들을 조합하여 하나의 객체를 만드는 것이다.
	 * 자동차를 만든다고 한다면 자동차의 부품들을 모아서 하나의 자동차를 만드는 것을 예로 들 수 있다.
	 * 요약하면, 각기 다른 능력을 지닌 concreate 객체를 생성하는데 있어서 통일 된 방식을 제공하는 것이다.
	 * */
	
	/* 파라미터 개수 별로(오버로딩) 생성자 메소드를 만드는 것을 점층적 생성자 패턴(Telescoping constructor pattern) 이라고 한다.
	 * Setter 메소드를 활용한 자바 빈 패턴(Java Bean Pattern)은 객체 생성 후 setter를 통해 값을 입력하지만, 함수 호출 1회로 객체 생성을 완료할 수 없으며
	 * 객체 일관성(Consistency)가 일시적으로 꺠질 수 있다. 또한 immutable 객체를 생성할 수 없다. 
	 **/
	
	public static void main(String[] args) 
	{
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonVegMeal = mealBuilder.nonPrepareVegMeal();
		
		vegMeal.showItems();
		System.out.println(vegMeal.getCost());
		
		System.out.println();
		
		nonVegMeal.showItems();
		System.out.println(nonVegMeal.getCost());
	}
}
