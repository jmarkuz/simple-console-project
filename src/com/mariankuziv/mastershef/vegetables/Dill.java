package com.mariankuziv.mastershef.vegetables;

/**
 * 
 * @author Marian Kuziv
 * @version 1.0
 *
 */

public class Dill extends SpicyVegetable {

	public Dill() {
		super("Dill", 35);
	}

	/**
	 * Constructor with parameters. Creates a Dill of a given weight.
	 * @param weight-the mass of the vegetable that will be created
	 */
	public Dill(int weight) {
		super("Dill", 35, weight);
	}
}
