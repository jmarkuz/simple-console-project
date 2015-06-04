package com.mariankuziv.mastershef.vegetables;

/**
 *RootVegetable (Коренеплоди)
 *@author Marian Kuziv
 *@version 1.0
 */

public abstract class RootVegetable extends Vegetable {

	public RootVegetable(String name, int calories) {
		super(name, calories);
		setCategory("RootVegetable");
	}

	public RootVegetable(String name, int calories, int weight) {
		super(name, calories, weight);
		setCategory("RootVegetable");
	}
}