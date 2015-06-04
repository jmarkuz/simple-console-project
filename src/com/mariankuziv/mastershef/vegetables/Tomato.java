package com.mariankuziv.mastershef.vegetables;

/**
 * Tomato (Томати)
 * @author User
 * @version 1.0
 */

public class Tomato extends CucurbitaceaeVegetable {

	public Tomato() {
		super("Tomato", 48);
	}
	/**
	 * Constructor with parameters. Creates a Tomato of a given weight.
	 * @param weight the mass of the vegetable that will be created
	 */
	public Tomato(int weight) {
		super("Tomato", 48, weight);
	}
}
