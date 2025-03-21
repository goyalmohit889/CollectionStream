package com.bridgelabz.collectionstream.generics.mealplan;

import java.util.ArrayList;
import java.util.List;

class MealPlanManager {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void displayMeals() {
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal);
        }
    }

    // Generic method to validate and generate meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(String mealName, T mealType) {
        System.out.println("Generating meal plan: " + mealName + " (" + mealType.getMealType() + ")");
        return new Meal<>(mealName, mealType);
    }
}