package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.builder.MealBuilder;

public class Client {
	
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder("TOY");

		mealBuilder.setMain("oi").setDessert("caraii").setDrink("coka").setDessert("petigatou").setSide("pouts");

		System.out.println(mealBuilder.now());
	}
}