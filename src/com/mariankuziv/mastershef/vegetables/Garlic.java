package com.mariankuziv.mastershef.vegetables;

public class Garlic extends RootVegetable {

	public Garlic() {
		super("Garlic", 30);
	}

	/**
	 * Constructor with parameters. Creates a Garlic of a given weight.
	 * 
	 * @param weight - the mass of the vegetable that will be created
	 */

	public Garlic(int weight) {
		super("Garlic", 30, weight);
	}

}
