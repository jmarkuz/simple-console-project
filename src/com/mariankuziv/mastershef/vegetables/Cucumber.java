package com.mariankuziv.mastershef.vegetables;

/**
 * Cucumber (Îã³ğîê)
 * @author Marian Kuziv
 * @version 1.0
 */

public class Cucumber extends CucurbitaceaeVegetable{

	public Cucumber() {
		super("Cucumber", 40);
	}
	
	/**
	 * Constructor with parameters. Creates a Cucumber of a given weight.
	 * @param weight - the mass of the vegetable that will be created.
	 */
	
	public Cucumber(int weight) {
		super("Cucumber", 40, weight);
	}
	
}
