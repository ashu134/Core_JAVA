package com.ashu.ABSTCH;

import java.util.ArrayList;

record OrderItem(int qty,ProductForSale product){}

public class Store {
    //defining and instantiating A arrayList of type ProductForSale
    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();

    public static void main(String[] args) {
        storeProduct.add(new ArtObject("Oil Painting",1331,"A impresssive work by AK mohan"));
        storeProduct.add(new ArtObject("Sculpture",2000,"Bronze work by Jk jitr in 1999"));
        storeProduct.add(new Furniture("Desk", 1400,"Mahogni"));
        storeProduct.add(new Furniture("Chair",2000,"Mahua"));
        listProduct();
        System.out.println("\nOrder 1");
        var order1= new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);
        System.out.println("\nOrder 2");
        var order2= new ArrayList<OrderItem>();
        addItemToOrder(order2,3,2);
        addItemToOrder(order2,2,4);
        addItemToOrder(order2,0,4);
        printOrder(order2);
    }
    public static void listProduct(){
        for(ProductForSale s: storeProduct){
            System.out.println("-".repeat(20));
            s.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,
                                      int qty){
        order.add(new OrderItem(qty,storeProduct.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal=0;
        for(var item :order){
            item.product().printPricedItem(item.qty());
            salesTotal+=item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales total = $%6.2f %n ",salesTotal);
    }
}
