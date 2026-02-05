package com.example.bank;

import java.util.ArrayList;

public class Account {
    private static int accNumb = 1111;
    private static ArrayList<Account> accounts = new ArrayList<>();

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

    public void createNewAccount(String username, String password){

        accounts.add(new Account(username, password,getAccNumb(),1000.00));
        accNumb++;
        for(Account a: accounts){
            System.out.println(a);
        }
        //System.out.println(accounts.get(0));
    }

    public static int getAccNumb() {
        return accNumb;
    }

    public static ArrayList<Account> getAccounts(){
        return accounts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username  +
                ", password=" + password +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }


}
