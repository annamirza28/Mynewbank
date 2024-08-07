/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.Customer;
import com.itexpert.homework.mybank.CustomerType;
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
public class CustomerTest {
    Customer customer;
    Customer businesscust;
    Customer individualcust;
    public CustomerTest() {
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
    customer = new Customer (3,"Lily Dear", CustomerType.INDIVIDUAL);
    businesscust = new Customer(1, "John Doe", CustomerType.BUSINESS);
    individualcust = new Customer(2, "Jane Smith", CustomerType.INDIVIDUAL);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
     @Test
    public void testCustomerID(){ 
        assertEquals(customer.getCustomerId(), 3);
        customer.setCustomerId(4);
        assertEquals(customer.getCustomerId(), 4);
    }
    @Test
    public void testCustomerName(){
        assertEquals(customer.getCustomerName(),"Lily Dear");
        customer.setCustomerName("Sara Ophra");
        assertEquals(customer.getCustomerName(), "Sara Ophra");
    }
     @Test
    public void testCustomerType(){
        assertEquals(customer.getCustomerType(), CustomerType.INDIVIDUAL);
        customer.setCustomerType(CustomerType.BUSINESS);
         assertEquals(customer.getCustomerType(), CustomerType.BUSINESS);
    }
    @Test
    public void testBusinessCustomerID(){ 
        assertEquals(businesscust.getCustomerId(), 1);
    }
    @Test
    public void testBusinessCustomerName(){
        assertEquals(businesscust.getCustomerName(), "John Doe");
    }
     @Test
    public void testBusinessCustomerType(){
        assertEquals(businesscust.getCustomerType(), CustomerType.BUSINESS);
    }
    @Test
    public void testIndividualCustomerID(){ 
        assertEquals(individualcust.getCustomerId(), 2);
    }
     @Test
    public void testIndividualCustomerName(){ 
        assertEquals(individualcust.getCustomerName(), "Jane Smith");
    }
     @Test
    public void testIndividualCustomerType(){ 
        assertEquals(individualcust.getCustomerType(),  CustomerType.INDIVIDUAL);
    }
      @Test
    public void testToString() {
        
        String expectedString = "Customer{" +
                                "customerId=" + customer.getCustomerId() +
                                ", customerName='" + customer.getCustomerName() + '\'' +
                                ", customerType=" + customer.getCustomerType() +
                                '}';
        assertEquals(customer.toString(), expectedString);
    }
}
