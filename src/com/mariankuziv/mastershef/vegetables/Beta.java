package com.mariankuziv.mastershef.vegetables;

/**
 * Beta (Буряк)
 * @author Marian Kuziv
 * @version 1.0
 */

public class Beta extends RootVegetable {

	public Beta() {
		super("Beta", 45);
	}

	/**
	 * Constructor with parameters. Creates a Beta of a given weight.
	 * @param weight - the mass of the vegetable that will be created
	 */
	public Beta(int weight) {
		super("Beta", 45, weight);
	}

}
