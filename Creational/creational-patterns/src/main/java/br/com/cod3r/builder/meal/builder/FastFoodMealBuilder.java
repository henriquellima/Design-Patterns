package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder{

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String gift) {
        this.gift = gift;
    }


    public FastFoodMealBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder setMain(String main) {
        this.main = main;
        return this;
    }


    public FastFoodMealBuilder setSide(String side) {
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMeal now(){
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
