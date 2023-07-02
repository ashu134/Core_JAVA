package com.ashu.OOPS;

public class Account {
    private  String number;
    private double balance;
    private String custName;
    private  String custMail;
    private String  custPhone;

    public void depositeFuds(double depositeAmount){
        balance =balance+depositeAmount;
        System.out.println("Deposite of $" + depositeAmount+ " made. New " +
                "Balance is $"+ balance);
    }
    public void withdrawFund(double withdrawalAmount){
        if(balance-withdrawalAmount<0){
            System.out.println("Your Account has only $"+ balance+ " Amount in you Account");
        }else{
            balance= balance-withdrawalAmount;
            System.out.println("Your Withdrawal Amount is $"+withdrawalAmount+" Remaining Balance in your account is $"+balance);
        }
    }

    public String getNumber() {
        return number;
    }


    public double getBalance() {
        return balance;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustMail() {
        return custMail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustMail(String custMail) {
        this.custMail = custMail;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
