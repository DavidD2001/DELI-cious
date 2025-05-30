package com.delicious;

import java.util.Scanner;

public class DrinkBuilder {

    public static Drinks buildDrink(Scanner scanner) {
        System.out.println("Enter drink type (e.g., Soda, Lemonade, Water):");
        String type = scanner.nextLine().trim();

        String size = "";
        boolean validSize = false;
        while (!validSize) {
            System.out.println("Choose drink size (Small / Medium / Large):");
            size = scanner.nextLine().trim();
            switch (size.toLowerCase()) {
                case "small":
                case "medium":
                case "large":
                    validSize = true;
                    break;
                default:
                    System.out.println("Invalid size. Please choose Small, Medium, or Large.");
            }
        }

        return new Drinks(type, size);
    }
}
