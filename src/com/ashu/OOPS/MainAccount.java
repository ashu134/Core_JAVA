package com.ashu.OOPS;

public class MainAccount {
    public static void main(String[] args) {
        Account acc= new Account();
        acc.withdrawFund(200);
        acc.depositeFuds(500);
        acc.withdrawFund(100);
    }
}
