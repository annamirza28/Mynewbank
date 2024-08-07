/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.mybank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Ana
 */
public class Bank {
    private int bankID;
    private String bankName;
    private String bankAddress;
    private HashMap<Integer,Employee> employees;
    private HashMap<Integer, Customer> customers;
    private HashMap<Integer, Account> accounts;
    private String filePath;
    
    public Bank(int bankID, String bankName, String bankAddress) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.employees = new HashMap<>();
        this.customers = new HashMap<>();
        this.accounts = new HashMap<>();
        
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

   
    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    // Add/Update Bank//
    public void addOrUpdateBank() {
        filePath = "c:\\data\\mybank.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        System.out.println("Enter new bank name");
        System.out.println("Enter Address");
        this.bankName = sc.next();
        saveDataToFile(filePath); 
       
    }
    // Add/Update Employee
    public void addOrUpdateEmployee(Employee employee ) {
        // Logic to add or update employee
        employees.put(employee.getEmployeeID(), employee);
        
    }  
    // Add/Update Customer
    public void addOrUpdateCustomer(Customer customer) {
        // Logic to add or update customer
        customers.put(customer.getCustomerId(), customer);
    }

    // Add/Update Account
    public void addOrUpdateAccount(Account account) {
        // Logic to add or update account
        accounts.put(account.getAccountID(),account);
    }
    public Map<Integer, Account> getAccounts() {
        return accounts;
    }
   // Show Employees
    public void showEmployees() {
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }

    // Show Customers
    public void showCustomers() {
        for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }

    // Show Accounts
    public void showAccounts() {
        for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {
            System.out.println("Account ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }

   
    // Search Customer by ID
    public Customer searchCustomerByID(int customerId) {
        return customers.get(customerId);
    }

    // Search Employee by ID
    public Employee searchEmployeeByID(int employeeID) {
        return employees.get(employeeID);
    }
    //Search Account by ID
     public Account searchAccountByID(int accountID) {
        return accounts.get(accountID);
    }
      
      // Load data from file
    public void loadDataFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens()) {
                    String token = st.nextToken().trim();
                    String[] parts = token.split("=");

                    if (parts.length == 3) {
                        String key = parts[0];
                        int id = Integer.parseInt(parts[1]);
                        String[] data = parts[2].split(",");

                        switch (key) {
                            case "bankID":
                                String bankName = data[0].split(":")[1];
                                Bank bank = new Bank(id, bankName,bankAddress);
                            case "employeeID":
                                String empName = data[0].split(":")[1];
                                EmployeeType empType = EmployeeType.valueOf(data[1].split(":")[1]); // Parse enum
                                Employee employee = new Employee(id, empName, empType);
                                employees.put(id, employee); // Add employee to the map
                            break;
                            case "customerID":
                                String custName = data[0].split(":")[1];
                                CustomerType custType = CustomerType.valueOf(data[1].split(":")[1]);
                                Customer customer = new Customer(id, custName, custType);
                                customers.put(id, customer);
                                break;
                            case "accountID":
                                String accType = data[0].split(":")[1];
                                double balance = Double.parseDouble(data[1].split(":")[1]);
                                String accCustomerName = data[2].split(":")[1];
                                AccountType accountType = AccountType.valueOf(accType);
                                Account account = new Account(id, accountType, balance, accCustomerName);
                                accounts.put(id, account);
                                break;
                            default:
                                System.out.println("Unknown key: " + key);
                                break;
                        }
                    }
                }
            }
            System.out.println("Data loaded successfully from file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing numeric value: " + e.getMessage());
        }
    }

    // Save data to file
    public void saveDataToFile(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Bank header
            
            bw.write(" Bank: ID = " + this.bankID   +  "Name = "  + this.bankName   +    "Address = "  + this.bankAddress);
            bw.newLine();
            bw.write("-----------------------------------------");
            bw.newLine();

            // Employees header
            bw.write("List of Employees:");
            bw.newLine();
            bw.write("-----------------------------------------");
            bw.newLine();
            for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
                bw.write("employeeID=" + entry.getKey() + ",");
                bw.write("employeeName=" + entry.getValue().getEmployeeName() + ",");
                bw.write("employeeType=" + entry.getValue().getEmployeeType());
                bw.newLine();
            }
            bw.write("-----------------------------------------");
            bw.newLine();

            // Customers header
            bw.write("List of Customers:");
            bw.newLine();
            bw.write("-----------------------------------------");
            bw.newLine();
            for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
                bw.write("customerID=" + entry.getKey() + ",");
                bw.write("customerName=" + entry.getValue().getCustomerName() + ",");
                bw.write("customerType=" + entry.getValue().getCustomerType());
                bw.newLine();
            }
            bw.write("-----------------------------------------");
            bw.newLine();

            // Accounts header
            bw.write("List of Accounts:");
            bw.newLine();
            bw.write("-----------------------------------------");
            bw.newLine();
            for (Map.Entry<Integer, Account> entry : accounts.entrySet()) {
                bw.write("accountID=" + entry.getKey() + ",");
                bw.write("accountType=" + entry.getValue().getAccountType() + ",");
                bw.write("balance=" + entry.getValue().getBalance() + ",");
                bw.write("customerName=" + entry.getValue().getCustomerName());
                bw.newLine();
            }
            bw.write("-----------------------------------------");
            bw.newLine();
            System.out.println("Data saved successfully to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }
}

      
       

