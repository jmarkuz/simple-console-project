package com.mariankuziv.mastershef.salads;

import com.mariankuziv.mastershef.vegetables.Cucumber;
import com.mariankuziv.mastershef.vegetables.Garlic;
import com.mariankuziv.mastershef.vegetables.Parsley;
import com.mariankuziv.mastershef.vegetables.Tomato;

public class SpringSalad extends Salad {

	public SpringSalad() {
		super("SpringSalad");
		System.out.println("Making \"SpringSalad\"");
		addIngredient(new Cucumber(400));
		addIngredient(new Tomato(300));
		addIngredient(new Garlic(50));
		addIngredient(new Parsley(50));
	}

}
