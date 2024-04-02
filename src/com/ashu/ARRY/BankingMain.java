package com.ashu.ARRY;

import java.util.ArrayList;


record Customer(String name, ArrayList<Double> transaction) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transaction.add(initialDeposit);
    }
}

public class BankingMain {
    public static void main(String[] args) {
        Customer Aashu = new Customer("Aashu", 1000);
        System.out.println(Aashu);
        System.out.println(Aashu.getClass().getName());

        Bank bank = new Bank("SBI");
        bank.addNewCustomer("Aashu", 500);
        bank.addTransction("Aashu", -100);

        bank.addNewCustomer("Amar", 00);
        bank.addTransction("Amar", 100);
        bank.printStatement("Amar");
        bank.addTransction("Briz", 200);
        bank.printStatement("Briz");


        System.out.println(bank);
        bank.printStatement("Aashu");


    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String CustName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(CustName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", CustName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer Added: " + customer);

        }
    }

    public void addTransction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transaction().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(20));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transaction()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "Debit" : "Credit");
        }
    }

}