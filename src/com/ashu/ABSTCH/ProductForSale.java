package com.ashu.ABSTCH;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    //concrete class
    public double getSalesPrice(int qty) {
        return qty * price;
    }

    public void printPricedItem(int qty) {
        //%2d means will print only 2 digit
        //$%8.2f means float number with length 8 and precision 2
        // %-15s means String with 15 space from start
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                qty, price, type, description);
    }

    public abstract void showDetails();
}
