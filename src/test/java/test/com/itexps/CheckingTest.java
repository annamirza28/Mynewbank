/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.AccountType;
import com.itexpert.homework.mybank.Checking;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Cornel
 */
public class CheckingTest {
    Checking checking;
    public CheckingTest() {
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
     checking = new Checking(401, AccountType.CHECKING, 3000.00, "Celine Mira");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        checking = null;
    }
     @Test
    public void testChecking() {
        assertEquals(checking.getAccountID(), 401);
        assertEquals(checking.getAccountType(), AccountType.CHECKING);
        assertEquals(checking.getBalance(), 3000.00);
        assertEquals(checking.getCustomerName(), "Celine Mira");
    }
     @Test
    public void testToString() {
        String expectedString = "Checking{" +
                                "accountID=" + checking.getAccountID() +
                                ", accountType=" + checking.getAccountType() +
                                ", balance=" + checking.getBalance() +
                                ", customerName='" + checking.getCustomerName() + '\'' +
                                '}';
        assertEquals(checking.toString(), expectedString);
    }
}
