package com.delicious;

public class Drinks extends OrderItem {
    private String type;
    private String size;

    public Drinks(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        switch (size.toLowerCase()) {
            case "small": return 1.25;
            case "medium": return 1.75;
            case "large": return 2.25;
            default: return 0.0;
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Drink: " + size + " " + type);
        System.out.printf("Price: $%.2f\n", calculatePrice());
    }
}
