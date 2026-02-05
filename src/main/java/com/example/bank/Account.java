package com.example.bank;

public class Account {
    private static int accNumb = 1111;

    String username;
    String password;
    int accountNumber;
    double balance;

    public Account(String username, String password, int accountNumber, double balance){
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static int getAccNumb() {
        return accNumb;
    }
}
