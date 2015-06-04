package com.mariankuziv.mastershef.vegetables;

/**
 * Carrot (Морква)
 * @author Marian Kuziv
 * @version 1.0
 */

public class Carrot extends RootVegetable {
	public Carrot() {
		super("Carot", 55);
	}

	/**
	 * Constructor with parameters. Creates a Carrot of a given weight.
	 * @param weight - the mass of the vegetable that will be created
	 */
	
	public Carrot(int weight) {
		super("Carot", 55, weight);
	}
}
