package com.mariankuziv.mastershef.salads;

import com.mariankuziv.mastershef.vegetables.*;

public class Vinigret extends Salad {

	public Vinigret() {
		super("Vinigret");
		System.out.println("Making \"Vinigret\"");
		this.addIngredient(new Beta(200));
		this.addIngredient(new Carrot(150));
		this.addIngredient(new Potato(180));
		this.addIngredient(new Dill(50));
	}

}