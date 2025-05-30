package com.delicious;

import java.util.*;

public class DeliApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to DELI-cious!");
            System.out.println("1) New Order");
            System.out.println("2) Exit");
            System.out.print("Choose an option: ");
            String homeChoice = scanner.nextLine().trim();

            switch (homeChoice) {
                case "1":
                    processOrder(scanner);
                    break;
                case "2":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1 or 2.");
            }
        }
        scanner.close();
    }

    private static void processOrder(Scanner scanner) {
        ArrayList<OrderItem> order = new ArrayList<>();
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n--- Order Menu ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    Sandwich sandwich = SandwichBuilder.buildSandwich(scanner);
                    order.add(sandwich);
                    break;
                case "2":
                    Drinks drink = DrinkBuilder.buildDrink(scanner);
                    order.add(drink);
                    break;
                case "3":
                    Chips chips = ChipsBuilder.buildChips(scanner);
                    order.add(chips);
                    break;
                case "4":
                    printReceipt(order);
                    ordering = false;
                    break;
                case "0":
                    order.clear();
                    System.out.println("Order canceled. Returning to home screen.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printReceipt(ArrayList<OrderItem> order) {
        System.out.println("\n--- Receipt ---");
        double total = 0.0;
        for (int i = order.size() - 1; i >= 0; i--) {
            OrderItem item = order.get(i);
            item.displayDetails();
            total += item.calculatePrice();
            System.out.println("-----------------------");
        }
        System.out.printf("Total Price: $%.2f\n", total);
    }
}
