/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

/**
 *
 * @author Ana
 */
public class Account {
    private int accountID;
    private AccountType accountType; // Use AccountType enum instead of generic Enum
    private double balance;
    private String customerName;

    public Account(int accountID, AccountType accountType, double balance, String customerName) {
        this.accountID = accountID;
        this.accountType = accountType;
        this.balance = balance;
        this.customerName = customerName;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) { // Ensure deposit amount is positive
            this.balance = this.balance + amount;
            System.out.println("Your new balance is =" + this.balance);
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) { // Ensure withdrawal amount is positive and less than balance
            this.balance -= amount;
           System.out.println("Your new balance is =" + this.balance); 
        }
    }

    // Set the balance directly
    public void setBalance(double amount) {
        if (amount >= 0) { // Ensure balance is non-negative
            this.balance = amount;
        }
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    // Getters and Setters
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

   @Override
public String toString() {
    return "Account{" +
           "accountID=" + getAccountID() +
           ", accountType=" + getAccountType() +
           ", balance=" + getBalance() +
           ", customerName='" + getCustomerName() + '\'' +
           '}';
}
}
