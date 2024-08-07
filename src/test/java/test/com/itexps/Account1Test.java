/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.Account;
import com.itexpert.homework.mybank.AccountType;
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
public class Account1Test {
    Account account ;
    public Account1Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        account = new Account(1, AccountType.CHECKING, 1000.00, "John Doe");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        account = null;// Clean up after each test
    }
    @Test
    public void testAccountID(){
        assertEquals(account.getAccountID(), 1);
        account.setAccountID(2);
        assertEquals(account.getAccountID(), 2);
    }
     @Test
    public void testAccountType(){
        assertEquals(account.getAccountType(), AccountType.CHECKING);
        account.setAccountType(AccountType.CHECKING);
        assertEquals(account.getAccountType(), AccountType.CHECKING);
    }
     @Test
    public void testAccountBalance(){
        assertEquals(account.getBalance(),1000.00 );
        account.setBalance(2000.00);
         assertEquals(account.getBalance(), 2000.00);
    }
     @Test
    public void testAccountCustomerName(){
        assertEquals(account.getCustomerName(),"John Doe" );
        account.setCustomerName("Emily Deer");
         assertEquals(account.getCustomerName(), "Emily Deer");
    }
     @Test
    public void testDeposit() {
        account.deposit(500.00); // Deposit into the account
        assertEquals(account.getBalance(), 1500.00);
        
    }
     @Test
    public void testWithdraw() {
        account.withdraw(200.00); // Withdraw from the account
        assertEquals(account.getBalance(), 800.00);
    }
     @Test
    public void testWithdrawOutOfFunds() {
        account.withdraw(1200.00); // Attempt to withdraw more than the balance
        assertEquals(account.getBalance(), 1000.00);
    }
     @Test
    public void testCheckBalance() {
        assertEquals(account.getBalance(), 1000.00);
    }
    @Test
    public void testSetBalance() {
        account.setBalance(2000.00); // Set a new balance
        assertEquals(account.getBalance(), 2000.00);
    }
    @Test
public void testToString() {
    // Create an instance of Account with test data
    Account acc = new Account(1, AccountType.CHECKING, 1000.00, "John Doe");
    String expectedString = "Account{" +
                            "accountID=1" +
                            ", accountType=CHECKING" +
                            ", balance=1000.0" +
                            ", customerName='John Doe'" +
                            '}';
    String actualString = acc.toString();
    System.out.println("Actual toString() output: " + actualString);
    System.out.println("Expected toString() output: " + expectedString);
    assertEquals(expectedString, actualString);
}
     @Test
    public void testDepositNegativeAmount() {
        account.deposit(-100.00); // Deposit a negative amount
        assertEquals(account.getBalance(), 1000.00);
    }
     @Test
    public void testWithdrawNegativeAmount() {
        account.withdraw(-100.00); // Withdraw a negative amount
        assertEquals(account.getBalance(), 1000.00);
    }
    
}
