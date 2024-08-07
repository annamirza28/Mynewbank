/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.AccountType;
import com.itexpert.homework.mybank.FixedDeposit;
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
public class FixedDepositTest {
    FixedDeposit fd;
    public FixedDepositTest() {
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
        fd = new FixedDeposit(308, AccountType.FIXEDDEPOSIT, 5000.00, "Rony Saw");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         fd = null;
    }
    @Test
    public void testDepositOnFixedDeposit(){
    fd.deposit(1000.00);
        assertEquals(fd.getBalance(), 6000.00);
    }
    @Test
    public void testWithdrawalOnFixedDeposit(){
    fd.withdraw(1000.00);
        assertEquals(fd.getBalance(), 4000.00);
    }
    @Test
    public void testFixedDeposit(){
        assertEquals(fd.getAccountID(), 308);
        assertEquals(fd.getAccountType(), AccountType.FIXEDDEPOSIT);
        assertEquals(fd.getBalance(), 5000.00);
        assertEquals(fd.getCustomerName(), "Rony Saw");
    }
     @Test
    public void testToString() {
        String expectedString = "FixedDeposit{" +
                                "accountID=" + fd.getAccountID() +
                                ", accountType=" + fd.getAccountType() +
                                ", balance=" + fd.getBalance() +
                                ", customerName='" + fd.getCustomerName() + '\'' +
                                '}';
        assertEquals(fd.toString(), expectedString);
    }
}
