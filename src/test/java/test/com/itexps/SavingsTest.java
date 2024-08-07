/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.AccountType;
import com.itexpert.homework.mybank.Savings;
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
public class SavingsTest {
    Savings savings;
    public SavingsTest() {
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
    savings = new Savings(501, AccountType.SAVINGS, 8000.00, "Jane Smith");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    savings = null;
    }
     @Test
    public void testSavings() {
        assertEquals(savings.getAccountID(), 501);
        assertEquals(savings.getAccountType(), AccountType.SAVINGS);
        assertEquals(savings.getBalance(), 8000.00);
        assertEquals(savings.getCustomerName(), "Jane Smith");
    }
     @Test
    public void testToString() {
        String expectedString = "Savings{" +
                                "accountID=" + savings.getAccountID() +
                                ", accountType=" + savings.getAccountType() +
                                ", balance=" + savings.getBalance() +
                                ", customerName='" + savings.getCustomerName() + '\'' +
                                '}';
        assertEquals(savings.toString(), expectedString);
    }
}
