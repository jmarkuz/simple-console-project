package com.mariankuziv.mastershef.vegetables;

/**
 * Potato (Картопля)
 * @author Marian Kuziv
 * @version 1.0
 */

public class Potato extends RootVegetable {

	public Potato() {
		super("Potato", 65);
	}

	/**
	 * Constructor with parameters. Creates a Potato of a given weight.
	 * @param weight - the mass of the vegetable that will be created
	 */

	public Potato(int weight) {
		super("Potato", 65, weight);
	}

}
