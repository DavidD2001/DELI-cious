package com.delicious;

import java.util.Scanner;

public class Chips extends OrderItem {
    private String flavor;

    public Chips(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double calculatePrice() {
        return 1.50; // Flat price for all chips
    }

    @Override
    public void displayDetails() {
        System.out.println("Chips - Flavor: " + flavor + " | Price: $" + String.format("%.2f", calculatePrice()));
    }

    public String getFlavor() {
        return flavor;
    }

    public static Chips buildChips(Scanner scanner) {
        System.out.println("Enter chip flavor (e.g., BBQ, Sour Cream, Original):");
        String flavor = scanner.nextLine().trim();
        return new Chips(flavor);
    }
}
