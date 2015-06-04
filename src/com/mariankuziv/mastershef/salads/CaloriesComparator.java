package com.mariankuziv.mastershef.salads;

import java.util.Comparator;
import com.mariankuziv.mastershef.vegetables.Vegetable;

/**
 * This class implements interface Comparator to compare Vegetables by their
 * calories in the Salad.
 * 
 * @version 1.0
 * @author Marian Kuziv
 */
public class CaloriesComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable v1, Vegetable v2) {
		return v1.getCalories() - v2.getCalories();
	}

}
