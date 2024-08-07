/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Customer {
    private int customerId;
    private String customerName;
    private CustomerType customerType;
    private String uid, pwd;

    public Customer(int customerId, String customerName, CustomerType customerType) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerType = customerType;
    }

 
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerType=" + customerType +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}
