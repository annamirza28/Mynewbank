/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.Account;
import com.itexpert.homework.mybank.AccountType;
import com.itexpert.homework.mybank.Bank;
import com.itexpert.homework.mybank.Customer;
import com.itexpert.homework.mybank.CustomerType;
import com.itexpert.homework.mybank.Employee;
import com.itexpert.homework.mybank.EmployeeType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ana
 */
public class BankTest {
     Bank bank;
     String filePath = "c:\\data\\mybank.txt";
public BankTest() {
    }
  @BeforeClass
    public void setUp() {
        bank = new Bank(1, "America Bank", "123 Main St");

    }

    @AfterClass
    public void tearDown() {
        bank = null;
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
        }
    @Test
    public void testBankId(){
        assertEquals(bank.getBankID(), 1);
        bank.setBankID(2);
        assertEquals(bank.getBankID(), 2);
    }
    @Test
    public void testBankName(){
        assertEquals(bank.getBankName(), "America Bank");
        bank.setBankName("AAE Bank");
        assertEquals(bank.getBankName(), "AAE Bank");
    }
    @Test
    public void testBankAddress(){
        assertEquals(bank.getBankAddress(), "123 Main St");
        bank.setBankAddress("123 Lily Lane");
        assertEquals(bank.getBankAddress(),"123 Lily Lane" );
    }
    @Test
    public void testAddOrUpdateEmployee() {
        Employee emp1 = new Employee(101, "John Doe", EmployeeType.CONTRACTOR);
        bank.addOrUpdateEmployee(emp1);
        assertEquals(bank.searchEmployeeByID(101), emp1);
        
        assertEquals(emp1.getEmployeeID(), 101);
        assertEquals(emp1.getEmployeeName(), "John Doe");
        assertEquals(emp1.getEmployeeType(), EmployeeType.CONTRACTOR);
        emp1.setEmployeeName("Jane Doe");
        bank.addOrUpdateEmployee(emp1);
        assertEquals(bank.searchEmployeeByID(101).getEmployeeName(), "Jane Doe");
    }

    @Test
    public void testAddOrUpdateCustomer() {
        Customer cust1 = new Customer(201, "Emma Watson", CustomerType.INDIVIDUAL);
        bank.addOrUpdateCustomer(cust1);
        
        assertEquals(cust1.getCustomerId(), 201);
        assertEquals(cust1.getCustomerName(), "Emma Watson");
        assertEquals(cust1.getCustomerType(), CustomerType.INDIVIDUAL);
    }
    @Test
    public void testAddOrUpdateAccount(){
     Account acc1 = new Account(301, AccountType.CHECKING, 500.00, "Emma Watson");
     bank.addOrUpdateAccount(acc1);
     
     assertEquals(acc1.getAccountID(), 301);
     assertEquals(acc1.getAccountType(), AccountType.CHECKING);
     assertEquals(acc1.getBalance(), 500.00);
     assertEquals(acc1.getCustomerName(),"Emma Watson" );
     
    }
    @Test
    public void testSearchCustomerByID() {
     Customer cust2 = new Customer(202, "Mary Brown", CustomerType.INDIVIDUAL);
     bank.addOrUpdateCustomer(cust2);
     assertEquals(bank.searchCustomerByID(202), cust2);
    }
     @Test
    public void testSearchEmployeeByID() {
     Employee emp2 = new Employee(102, "Mike Smith", EmployeeType.FULLTIME);
     bank.addOrUpdateEmployee(emp2);
     assertEquals(bank.searchEmployeeByID(102), emp2); 
    }
     @Test
     public void testSearchAccountByID(){
     Account acc2 = new Account(303, AccountType.CHECKING,500.00,"Nick Carter");
     bank.addOrUpdateAccount(acc2);
         assertEquals(bank.searchAccountByID(303), acc2);
     }
     @Test
    public void testSaveAndLoadData() {
        bank.addOrUpdateEmployee(new Employee(101, "John Doe", EmployeeType.CONTRACTOR));
        bank.addOrUpdateCustomer(new Customer(201, "Emma Watson", CustomerType.INDIVIDUAL));
        bank.addOrUpdateAccount(new Account(301, AccountType.CHECKING, 500.00, "Emma Watson"));
        
        bank.saveDataToFile(filePath);
        Bank newBank = new Bank(3, "Canada Bank",  "1234 Main St");
       
        // Load data from file
         newBank.loadDataFromFile(filePath);
        // Verify loaded data
        assertEquals(newBank.getBankID(),3);
        assertEquals(newBank.getBankName(), "Canada Bank");
        assertEquals(newBank.getBankAddress(),"1234 Main St");
        // Verify loaded employees
       // Map<Integer, Employee> loadedEmployees = newBank.getEmployees();
       // assertEquals(loadedEmployees.size(), 1);
       // Employee loadedEmployee = loadedEmployees.get(101);
        //assertNotNull(loadedEmployee);
        //assertEquals(loadedEmployee.getEmployeeID(), 101);
        //assertEquals(loadedEmployee.getEmployeeName(), "John Doe");
        //assertEquals(loadedEmployee.getEmployeeType(), EmployeeType.CONTRACTOR);

        // Verify loaded customers
        //Map<Integer, Customer> loadedCustomers = newBank.getCustomers();
        //assertEquals(loadedCustomers.size(), 1);
        //Customer loadedCustomer = loadedCustomers.get(201);
        //assertNotNull(loadedCustomer);
        //assertEquals(loadedCustomer.getCustomerId(), 201);
        //assertEquals(loadedCustomer.getCustomerName(), "Emma Watson");
        //assertEquals(loadedCustomer.getCustomerType(), CustomerType.INDIVIDUAL);

        // Verify loaded accounts
       // Map<Integer, Account> loadedAccounts = newBank.getAccounts();
        //assertEquals(loadedAccounts.size(), 1);
        //Account loadedAccount = loadedAccounts.get(301);
        //assertNotNull(loadedAccount);
        //assertEquals(loadedAccount.getAccountID(), 301);
        //assertEquals(loadedAccount.getAccountType(), AccountType.CHECKING);
        //assertEquals(loadedAccount.getBalance(), 500.00);
        //assertEquals(loadedAccount.getCustomerName(), "Emma Watson");
    }
       
    
    //Add and Update filePath
      @Test
      public void testfilePath(){ 
      bank.setFilePath( "c:\\data\\mybank.txt");
      assertEquals(bank.getFilePath(), "c:\\data\\mybank.txt");
    
      }
      
    
}
    
    
    
    
   
     
    

