package com.mariankuziv.mastershef;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mariankuziv.mastershef.salads.CarrotSalad;
import com.mariankuziv.mastershef.salads.Salad;
import com.mariankuziv.mastershef.salads.SpringSalad;
import com.mariankuziv.mastershef.salads.Vinigret;

/**
 * This class realizes the main logic of the program, provides methods to create
 * salad, manage its ingredients, sort ingredients, count calories.
 * 
 * @author Marian Kuziv
 * @version 1.0
 *
 */
public class Chef {

	private String name = "";
	private Salad salad = null;

	private static Chef chef;

	private Chef() {
		name = "Jemie Oliver";
	}

	public static Chef getChef() {
		if (chef == null)
			chef = new Chef();
		return chef;
	}

	public String getChefsName() {
		return name;
	}

	public Salad makeSalad(String saladType) {
		if (saladType.equalsIgnoreCase("Vinigret")) {
			salad = new Vinigret();
			return salad;
		} else if (saladType.equalsIgnoreCase("CarrotSalad")) {
			salad = new CarrotSalad();
			return salad;
		} else if (saladType.equalsIgnoreCase("SpringSalad")) {
			salad = new SpringSalad();
			return salad;
		}
		return null;
	}

	public int countCalories() {
		if (salad != null)
			return salad.countCalories();
		else
			System.out.println("You haven't added any salad yet!");
		return 0;
	}

	public void sortByCalories() {
		if (salad != null)
			salad.sortByCalories();
		else
			System.out.println("You haven't added any salad yet!");
	}

	public void sortByWeight() {
		if (salad != null)
			salad.sortByWeight();
		else
			System.out.println("You haven't added any salad yet!");
	}

	public void showIngredientsByCalories(Scanner scanner) {
		
		int lowerCalories, upperCalories;
		System.out.println("Enter the lower calories limit:");
		
		try {
			lowerCalories = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
			scanner.next();

			return;
		}

		System.out.println("Enter the upper calories limit:");
		try {
			upperCalories = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
			scanner.next();

			return;
		}

		salad.showIngredientsByCalories(lowerCalories, upperCalories);
	}

	public void showRecipe() {
		if (salad != null)
			salad.showRecipe();
		else
			System.out.println("You haven't any salads yet!");
	}
}
