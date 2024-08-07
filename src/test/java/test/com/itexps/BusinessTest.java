/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.Business;
import com.itexpert.homework.mybank.CustomerType;
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
public class BusinessTest {
    Business business;
    public BusinessTest() {
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
     business = new Business(204,"Amy Dason",CustomerType.BUSINESS);   
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         business = null;
    }
     @Test
    public void testToString() {
        String expectedString = "Business{" +
                                "customerId=" + business.getCustomerId() +
                                ", customerName='" + business.getCustomerName() + '\'' +
                                ", customerType=" + business.getCustomerType() +
                                '}';
        assertEquals(business.toString(), expectedString);
    }
    @Test
    public void testBusiness(){
        assertEquals(business.getCustomerId(), 204);
        assertEquals(business.getCustomerName(), "Amy Dason");
        assertEquals(business.getCustomerType(), CustomerType.BUSINESS);
    }
}
