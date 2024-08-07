/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

/**
 *
 * @author Ana
 */
public class Individual extends Customer {
    
    public Individual(int customerId, String customerName, CustomerType customerType) {
        super(customerId, customerName, customerType);
    }
      @Override
    public String toString() {
        return "Individual{" +
                "customerId=" + getCustomerId() +
                ", customerName='" + getCustomerName() + '\'' +
                ", customerType=" + getCustomerType() +
                '}';
    }
    
}
