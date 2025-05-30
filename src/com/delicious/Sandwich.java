package com.delicious;

import java.util.ArrayList;

public class Sandwich extends OrderItem {
    private String size;
    private String breadType;
    private boolean toasted;
    private ArrayList<String> toppings;

    public Sandwich() {
        this.size = "";
        this.breadType = "";
        this.toasted = false;
        this.toppings = new ArrayList<>();
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    @Override
    public double calculatePrice() {
        double basePrice = 0.0;
        switch (size) {
            case "4\"": basePrice = 4.0; break;
            case "8\"": basePrice = 6.0; break;
            case "12\"": basePrice = 8.0; break;
            default: basePrice = 5.0;
        }
        basePrice += toppings.size() * 0.50; // each topping costs 0.50
        return basePrice;
    }

    @Override
    public void displayDetails() {
        System.out.println("Sandwich: " + size + " " + breadType + (toasted ? " (Toasted)" : ""));
        System.out.println("Toppings: " + (toppings.isEmpty() ? "None" : String.join(", ", toppings)));
        System.out.printf("Price: $%.2f\n", calculatePrice());
    }
}
