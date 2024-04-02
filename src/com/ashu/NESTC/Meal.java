package com.ashu.NESTC;

//Inner class challenge
public class Meal {
    private double price = 5.0;
    private Items burger;
    private Items drink;
    private Items side;
    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Items("Regular", "Burger");
        drink = new Items("Coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Items("fries", "side", 2.0);
    }

    public double getTotal() {
        double total = burger.price + drink.price + side.price;
        return Items.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total dues: ", getTotal());
    }

    private class Items {
        private String name;
        private String type;
        private double price;

        public Items(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Items(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name,
                    getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }
}
