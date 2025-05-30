package com.delicious;

import java.util.Scanner;

public class SandwichBuilder {
    public static Sandwich buildSandwich(Scanner scanner) {
        Sandwich sandwich = new Sandwich();

        System.out.print("Enter sandwich size (4\", 8\", or 12\"): ");
        sandwich.setSize(scanner.nextLine().trim());

        System.out.print("Enter bread type (White, Wheat, Sourdough): ");
        sandwich.setBreadType(scanner.nextLine().trim());

        System.out.print("Would you like it toasted? (yes/no): ");
        sandwich.setToasted(scanner.nextLine().trim().equalsIgnoreCase("yes"));

        boolean addingToppings = true;
        while (addingToppings) {
            System.out.print("Add topping (or type 'done'): ");
            String topping = scanner.nextLine().trim();
            if (topping.equalsIgnoreCase("done")) {
                addingToppings = false;
            } else {
                sandwich.addTopping(topping);
            }
        }

        return sandwich;
    }
}