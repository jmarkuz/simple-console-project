package com.mariankuziv.mastershef.salads;

import java.util.ArrayList;
import java.util.List;
import com.mariankuziv.mastershef.vegetables.Vegetable;

/**
 * Abstract class Salad consists of a set of ingredients (vegetables). It provides
 * methods to add ingredients, sort them by calories or by weight, and show on
 * the screen our salad recipe.
 * 
 * @author Marian Kuziv
 * @version 1.0
 *
 */
public abstract class Salad {

	private String name;
	private List<Vegetable> ingredients = new ArrayList<Vegetable>();

	public Salad(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean addIngredient(Vegetable vegetable) {
		ingredients.add(vegetable);
		return true;
	}

	public int countCalories() {
		int sum = 0;
		for (Vegetable vegetable : ingredients) {
			sum += vegetable.getCalories();
		}
		return sum;
	}

	public void sortByCalories() {
		ingredients.sort(new CaloriesComparator());
		toString();
	}

	public void sortByWeight() {
		ingredients.sort(new WeightComparator());
		toString();
	}

	public void showIngredientsByCalories(int lowerLimit, int upperLimit) {

		System.out.println("Ingredients for calories [" + lowerLimit + ", "
				+ upperLimit + "]");
		int calories = 0;
		for (Vegetable v : ingredients) {
			calories = v.getCalories();
			if (calories >= lowerLimit && calories <= upperLimit) {
				System.out.println(v.getName() + ", " + v.getCalories()
						+ "kcal per 100g");
			}
		}
	}

	public void showRecipe() {
		if (ingredients.isEmpty()) {
			System.out.println("You haven't added any ingredients yet!");
			return;
		}

		System.out.println("The salad " + name + " contains:");
		for (Vegetable vegetable : ingredients) {
			System.out.println(vegetable.toString());
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("Our salad ingridients: ");
		for (Vegetable v : ingredients) {
			sb.append(v.getName() + ";\n ");
		}
		return new String(sb);
	}
}
