package com.mariankuziv.mastershef.salads;

import com.mariankuziv.mastershef.vegetables.Carrot;
import com.mariankuziv.mastershef.vegetables.Dill;
import com.mariankuziv.mastershef.vegetables.Garlic;

public class CarrotSalad extends Salad {

	public CarrotSalad() {
		super("CarrotSalad");
		System.out.println("Making \"CarrotSalad\"");
		this.addIngredient(new Carrot(500));
		this.addIngredient(new Dill(50));
		this.addIngredient(new Garlic(40));
	}

}
