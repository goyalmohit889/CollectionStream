package com.bridgelabz.collectionstream.generics.mealplan;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanManager.generateMealPlan("Grilled Vegetables", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanManager.generateMealPlan("Tofu Salad", new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealPlanManager.generateMealPlan("Avocado Chicken", new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = MealPlanManager.generateMealPlan("Steak and Eggs", new HighProteinMeal());

        MealPlanManager manager = new MealPlanManager();
        manager.addMeal(vegMeal);
        manager.addMeal(veganMeal);
        manager.addMeal(ketoMeal);
        manager.addMeal(proteinMeal);

        System.out.println("\nPersonalized Meal Plans:");
        manager.displayMeals();
    }
}