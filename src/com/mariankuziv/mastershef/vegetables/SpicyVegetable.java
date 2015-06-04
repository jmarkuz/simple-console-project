package com.mariankuziv.mastershef.vegetables;

/**
 *SpicyVegetable (Прянощі)
 *@author Marian Kuziv
 *@version 1.0
 */

public abstract class SpicyVegetable extends Vegetable {

	public SpicyVegetable(String name, int calories) {
		super(name, calories);
		setCategory("Spicy Vegetable");
	}

	public SpicyVegetable(String name, int calories, int weight) {
		super(name, calories, weight);
		setCategory("Spicy Vegetable");
	}

}
