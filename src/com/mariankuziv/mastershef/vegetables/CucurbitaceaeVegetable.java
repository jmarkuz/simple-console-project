package com.mariankuziv.mastershef.vegetables;

public abstract class CucurbitaceaeVegetable extends Vegetable {

	public CucurbitaceaeVegetable(String name, int calories) {
		super(name, calories);
		setCategory("Cucurbitaceae Vegetable");
	}

	public CucurbitaceaeVegetable(String name, int calories, int weight) {
		super(name, calories, weight);
		setCategory("Cucurbitaceae Vegetable");
	}

}
