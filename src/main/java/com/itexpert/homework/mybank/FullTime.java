/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

/**
 *
 * @author Ana
 */
public class FullTime extends Employee{
    
    public FullTime(int employeeID, String employeeName) {
        super(employeeID, employeeName, EmployeeType.FULLTIME); 
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "employeeID=" + getEmployeeID() +
                ", employeeName='" + getEmployeeName() + '\'' +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
}
