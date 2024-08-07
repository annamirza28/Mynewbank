/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

/**
 *
 * @author Ana
 */
public class Checking extends Account {
    public Checking(int accountID, AccountType accountType, double balance, String customerName) {
        super(accountID, accountType, balance, customerName);
    }

    @Override
    public String toString() {
        return "Checking{" +
               "accountID=" + getAccountID() +
               ", accountType=" + getAccountType() +
               ", balance=" + getBalance() +
               ", customerName='" + getCustomerName() + '\'' +
               '}';
    }    
}
