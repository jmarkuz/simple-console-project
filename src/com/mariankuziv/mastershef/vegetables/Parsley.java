package com.mariankuziv.mastershef.vegetables;
/**
 * 
 * @author Marian Kuziv
 * @version 1.0
 *
 */
public class Parsley extends SpicyVegetable {

	public Parsley() {
		super("Parsley", 37);
	}

	/**
	 * Constructor with parameters. Creates a Parsley of a given weight.
	 * 
	 * @param weight-the mass of the vegetable that will be created
	 */
	public Parsley(int weight) {
		super("Parsley", 37, weight);
	}

}
