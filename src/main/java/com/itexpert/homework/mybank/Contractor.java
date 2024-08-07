/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

/**
 *
 * @author Ana
 */
public class Contractor extends Employee {
    
    public Contractor(int employeeID, String employeeName) {
        super(employeeID, employeeName, EmployeeType.CONTRACTOR);
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "employeeID=" + getEmployeeID() +
                ", employeeName='" + getEmployeeName() + '\'' +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
   
   
}
