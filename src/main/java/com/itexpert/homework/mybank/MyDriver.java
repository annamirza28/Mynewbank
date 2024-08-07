/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itexpert.homework.mybank;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
    public class MyDriver {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Bank bank = new Bank(1, " AAE Bank ", "123 Main St");
         
        String filePath = "c:\\data\\mybank.txt";
        //bank.addOrUpdateBank();

        //Create Employees
        Employee emp1 = new Employee(101, "J1ohn Doe", EmployeeType.CONTRACTOR);
        Employee emp2 = new Employee(102, "Mike Smith", EmployeeType.FULLTIME);
        Employee emp3 = new Employee(103, "Alice Davis", EmployeeType.CONTRACTOR);
        
        bank.addOrUpdateEmployee(emp1);
        bank.addOrUpdateEmployee(emp2);
        bank.addOrUpdateEmployee(emp3);
        
        //Create Customers
        Customer cust1 = new Customer(201, "Emma Watson", CustomerType.INDIVIDUAL);
        Customer cust2 = new Customer(202, "Mary Brown", CustomerType.INDIVIDUAL);
        Customer cust3 = new Customer(203, "Chris Lee", CustomerType.BUSINESS);
        Customer cust4 = new Customer(204, "Adam Snow", CustomerType.BUSINESS);
        Customer cust5 = new Customer(205, "Sasha Lopez", CustomerType.BUSINESS);
        Customer cust6 = new Customer(206, "Liam Red", CustomerType.INDIVIDUAL);
        
        bank.addOrUpdateCustomer(cust1);
        bank.addOrUpdateCustomer(cust2);
        bank.addOrUpdateCustomer(cust3);
        bank.addOrUpdateCustomer(cust4);
        bank.addOrUpdateCustomer(cust5);
        bank.addOrUpdateCustomer(cust6);
        
        //Create Accounts
        Account acc1 = new Account(301, AccountType.CHECKING, 500.00, "Emma Watson");
        Account acc2 = new Account(302, AccountType.CHECKING, 1000.00, "Mary Brown");
        Account acc3 = new Account(303, AccountType.SAVINGS, 1500.00, "Chris Lee");
        Account acc4 = new Account(304, AccountType.SAVINGS, 2000.00, "Adam Snow");
        Account acc5 = new Account(305, AccountType.CHECKING, 2500.00, "Sasha Lopez");
        Account acc6 = new Account(306, AccountType.SAVINGS, 3000.00, "Sasha Lopez");
        Account acc7 = new Account(307, AccountType.FIXEDDEPOSIT, 5000.00, "Liam Red");
        
        bank.addOrUpdateAccount(acc1);
        bank.addOrUpdateAccount(acc2);
        bank.addOrUpdateAccount(acc3);
        bank.addOrUpdateAccount(acc4);
        bank.addOrUpdateAccount(acc5);
        bank.addOrUpdateAccount(acc6);
        bank.addOrUpdateAccount(acc7);
        
        
        //Login
         boolean loginfail;
        do{
        String username = "ana", password = "Ana123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String uid = sc.next();
        System.out.println("Enter password");
        String pwd = sc.next();

        if (uid.equalsIgnoreCase(username) && pwd.equals(password)) {
            System.out.println("Login success");
            loginfail = false;
        } else {
            loginfail = true;
            System.out.println("Login fail");
        }
        }while(loginfail);
        
       // Load existing data from file
        bank.loadDataFromFile(filePath);
       int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu Options:");
            System.out.println("1. Add/Update Bank");
            System.out.println("2. Add/Update Employee");
            System.out.println("3. Add/Update Customer");
            System.out.println("4. Add/Update Account");
            System.out.println("5. Show Employees");
            System.out.println("6. Show Customers");
            System.out.println("7. Show Accounts");
            System.out.println("8. Search Customer by ID");
            System.out.println("9. Search Employee by ID");
            System.out.println("10. Make a deposit");
            System.out.println("11. Make withdrawal");
            System.out.println("12. Save and Quit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add/Update Bank
                    System.out.println("Enter new bank details:");
                    System.out.println("Bank ID:");
                    int bankID = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Bank Name:");
                    String bankName = sc.nextLine();
                    System.out.println("Bank Address:");
                    String bankAddress = sc.nextLine();
                    bank = new Bank(bankID, bankName, bankAddress);
                    System.out.println("Bank updated.");
                    break;

                case 2:
                    // Add/Update Employee
                    System.out.println("Enter employee details:");
                    System.out.println("Employee ID:");
                    int empID = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Employee Name:");
                    String empName = sc.nextLine();
                    System.out.println("Employee Type (FULLTIME/CONTRACTOR):");
                    String empTypeStr = sc.nextLine().toUpperCase();
                    EmployeeType empType;

                    try {
                        empType = EmployeeType.valueOf(empTypeStr);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid employee type. Please enter FULLTIME or CONTRACTOR.");
                        break;
                    }

                    Employee employee = new Employee(empID, empName, empType);
                    bank.addOrUpdateEmployee(employee);
                    break;

                case 3:
                    // Add/Update Customer
                    System.out.println("Enter customer details:");
                    System.out.println("Customer ID:");
                    int custID = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Customer Name:");
                    String custName = sc.nextLine();
                    System.out.println("Customer Type (BUSINESS/INDIVIDUAL):");
                    CustomerType custType;
                    try {
                        custType = CustomerType.valueOf(sc.nextLine().toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid customer type. Please enter BUSINESS or INDIVIDUAL.");
                        break;
                    }
                    Customer customer = new Customer(custID, custName, custType);
                    bank.addOrUpdateCustomer(customer);
                    break;

                case 4:
                    // Add/Update Account
                    System.out.println("Enter account details:");
                    System.out.println("Account ID:");
                    int accID = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Account Type (CHECKING/FIXEDDEPOSIT/SAVINGS):");
                    AccountType accType;
                    try {
                        accType = AccountType.valueOf(sc.nextLine().toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid account type. Please enter CHECKING, FIXEDDEPOSIT, or SAVINGS.");
                        break;
                    }
                    System.out.println("Balance:");
                    double balance = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    System.out.println("Customer Name:");
                    String customerName = sc.nextLine();
                    Account account = new Account(accID, accType, balance, customerName);
                    bank.addOrUpdateAccount(account);
                    break;

                case 5:
                    // Show Employees
                    System.out.println("List of Employees:");
                    bank.showEmployees();
                    break;

                case 6:
                    // Show Customers
                    System.out.println("List of Customers:");
                    bank.showCustomers();
                    break;

                case 7:
                    // Show Accounts
                    System.out.println("List of Accounts:");
                    bank.showAccounts();
                    break;

                case 8:
                    // Search Customer by ID
                    System.out.println("Enter customer ID to search:");
                    int searchCustID = sc.nextInt();
                    Customer foundCustomer = bank.searchCustomerByID(searchCustID);
                    if (foundCustomer != null) {
                        System.out.println("Customer found: " + foundCustomer);
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 9:
                    // Search Employee by ID
                    System.out.println("Enter employee ID to search:");
                    int searchEmpID = sc.nextInt();
                    Employee foundEmployee = bank.searchEmployeeByID(searchEmpID);
                    if (foundEmployee != null) {
                        System.out.println("Employee found: " + foundEmployee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 10:
                    //Make Deposit
                    System.out.println("Enter your Account ID");
                  int searchAccountID = sc.nextInt();
                 Account foundAccountID = bank.searchAccountByID(searchAccountID);
                    sc = new Scanner(System.in);
                    System.out.println("Enter deposit amount : ");
                    double depositamount = sc.nextDouble();
                    foundAccountID.deposit(depositamount);
                    break;
                case 11:   
                    //Make Withdrawal
                     System.out.println("Enter your Account ID");
                     searchAccountID = sc.nextInt();
                    foundAccountID = bank.searchAccountByID(searchAccountID);
                    sc = new Scanner(System.in);
                    System.out.println("Enter withdrawal amount : ");
                   double withdrawalamount = sc.nextDouble();
                    foundAccountID.withdraw(withdrawalamount);
                    break;

                case 12:
                    // Save and Quit
                    bank.saveDataToFile(filePath);
                    System.out.println("Exiting program. Data saved.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 10.");
                    break;
            }
        } while (choice != 12);

        sc.close(); // Close the scanner object
    }
}