package com.mariankuziv.mastershef.vegetables;

/**
 * This abstract class is the root of the Vegetable hierarchy. Provides basic methods to
 * get and set fields values. 
 * Vegetable (Îâî÷³).
 * 
 * @author Marian Kuziv
 * @version 1.0
 */

public abstract class Vegetable {

	private String name;
	private int weight;
	private int kcalPer100gram;
	private String category;

	public Vegetable(String name, int calories) {
		this.name = name;
		if (calories < 0)
			throw new IllegalArgumentException("Cannot create vegetable with "
					+ calories + " kcal");
		kcalPer100gram = calories;
		weight = 100;
	}

	public Vegetable(String name, int calories, int weight) {
		this.name = name;
		if (calories < 0)
			throw new IllegalArgumentException("Cannot create vegetable with "
					+ calories + " kcal.");
		if (weight < 0)
			throw new IllegalArgumentException("Cannot create vegetable with weight "
					+ weight + "g.");
		this.kcalPer100gram = calories;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCalories() {
		return kcalPer100gram;
	}

	public void setCalories(int kcalPer100gram) {
		this.kcalPer100gram = kcalPer100gram;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String toString() {
		return (weight + " gramms of " + name + " (" + category + "), "
	            + getCalories() + "kcal");
	}
}
