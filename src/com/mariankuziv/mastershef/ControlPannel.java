package com.mariankuziv.mastershef;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mariankuziv.mastershef.salads.Salad;

/**
 * Class ControlPannel provides method to show on the screen our console control menu.
 * 
 * @author Marian Kuziv
 * @version 1.0
 */
public class ControlPannel {

	private Chef chef;
	private Salad salad;
	
	public ControlPannel() {
		chef = Chef.getChef();
	}

	public void showConsolMenu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! I'm " + chef.getChefsName());
		System.out.println("\n Choose one of the options:");
		System.out.println("1. Make salad Vinigret.");
		System.out.println("2. Make salad SpringSalad.");
		System.out.println("3. Make salad CarrotSalad.");
		System.out.println("4. Count calories.");
		System.out.println("5. Sort ingredients by calories.");
		System.out.println("6. Sort ingredients by weight.");
		System.out.println("7. Get ingredients for calories.");
		System.out.println("0. Exit.");

		int choice = -1;

		while (choice != 0) {
			try {
				choice = scanner.nextInt();
				if (choice < 0 || choice > 7)
					throw new InputMismatchException();
			} catch (InputMismatchException e) {
				System.out.println("Wrong input data, expected integer [0;7]");
				choice = -1;
			}
			switch (choice) {
			case 1:
				salad = chef.makeSalad("Vinigret");
				chef.showRecipe();
				break;
			case 2:
				salad = chef.makeSalad("SpringSalad");
				chef.showRecipe();
				break;
			case 3:
				salad = chef.makeSalad("CarrotSalad");
				chef.showRecipe();
				break;
			case 4:
				int calories = chef.countCalories();
				System.out.println(salad.getName() + " has " + calories + " kcal");
				break;
			case 5:
				chef.sortByCalories();
				System.out.println("Sorted by calories.");
				chef.showRecipe();
				break;
			case 6:
				chef.sortByWeight();
				System.out.println("Sorted by weight.");
				chef.showRecipe();
				break;
			case 7:
				chef.showIngredientsByCalories(scanner);
				break;
			case 0:
				break;
			default:
				break;
			}
		}
		scanner.close();
		System.out.println("Good bye!");
		System.exit(0);
	}

}
