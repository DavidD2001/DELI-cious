package com.delicious;

public class SignatureSandwiches extends Sandwich {
    private String name;

    public SignatureSandwiches(String name, String size, String breadType, boolean toasted) {
        super(size, breadType, toasted); // Call to the parent constructor
        this.name = name;

        switch (name.toLowerCase()) {
            case "turkey club" -> {
                addTopping("Turkey");
                addTopping("Bacon");
                addTopping("Lettuce");
                addTopping("Tomato");
                addTopping("Mayo");
            }
            case "veggie deluxe" -> {
                addTopping("Lettuce");
                addTopping("Tomato");
                addTopping("Cucumber");
                addTopping("Avocado");
                addTopping("Sprouts");
            }
            case "original italian" -> {
                addTopping("Provolone");
                addTopping("Ham");
                addTopping("Prosciuttini");
                addTopping("Cappacuolo");
                addTopping("Salami");
                addTopping("Pepperoni");
            }
            default -> addTopping("Mystery Meat");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Signature Sandwich: " + name);
        super.displayDetails();
    }
}