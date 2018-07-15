package com.example.designpattern.builderpattern.builder;

import com.example.designpattern.builderpattern.burger.ChickenBurger;
import com.example.designpattern.builderpattern.burger.VegBurger;
import com.example.designpattern.builderpattern.drink.Coke;
import com.example.designpattern.builderpattern.drink.Pepsi;
import com.example.designpattern.builderpattern.meal.Meal;

public class MealBuilder 
{
	public Meal prepareVegMeal()
	{
		Meal meal = new Meal();
		
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal nonPrepareVegMeal()
	{
		Meal meal = new Meal();
		
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}
