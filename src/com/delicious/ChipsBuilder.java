package com.delicious;

import java.util.*;

public class ChipsBuilder {

    public static Chips buildChips(Scanner scanner) {
        System.out.println("Choose a chip flavor:");
        System.out.println("1) BBQ");
        System.out.println("2) Sour Cream");
        System.out.println("3) Original");
        System.out.print("Enter your choice (1–3): ");

        String choice = scanner.nextLine().trim();
        String flavor;

        switch (choice) {
            case "1":
                flavor = "BBQ";
                break;
            case "2":
                flavor = "Sour Cream";
                break;
            case "3":
                flavor = "Original";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to 'Original'.");
                flavor = "Original";
                break;
        }

        return new Chips(flavor);
    }
}