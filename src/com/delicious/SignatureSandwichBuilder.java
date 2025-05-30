package com.delicious;

import java.util.Scanner;

public class SignatureSandwichBuilder {

    public static SignatureSandwiches buildSignatureSandwich(Scanner scanner) {
        System.out.println("Choose a Signature Sandwich:");
        System.out.println("1) Turkey Club");
        System.out.println("2) Veggie Deluxe");
        System.out.println("3) Original Italian");
        System.out.print("Enter your choice (1-3): ");

        String choice = scanner.nextLine().trim();
        String name = switch (choice) {
            case "1" -> "Turkey Club";
            case "2" -> "Veggie Deluxe";
            case "3" -> "Original Italian";
            default -> {
                System.out.println("Invalid selection. Defaulting to Mystery Meat.");
                yield "Mystery Meat";
            }
        };

        System.out.print("Choose sandwich size (4\" / 8\" / 12\"): ");
        String size = scanner.nextLine().trim();

        System.out.print("Choose bread type (White / Wheat / Sourdough / Wrap): ");
        String breadType = scanner.nextLine().trim();

        System.out.print("Would you like it toasted? (Y/N): ");
        boolean toasted = scanner.nextLine().trim().equalsIgnoreCase("y");

        return new SignatureSandwiches(name, size, breadType, toasted);
    }
}
