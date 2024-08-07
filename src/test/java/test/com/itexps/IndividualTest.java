/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.CustomerType;
import com.itexpert.homework.mybank.Individual;
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
public class IndividualTest {
    Individual individual;
    public IndividualTest() {
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
    individual = new Individual(101, "John Smith", CustomerType.INDIVIDUAL);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    individual = null;
    }
    @Test
    public void testIndividual() {
        assertEquals(individual.getCustomerId(), 101);
        assertEquals(individual.getCustomerName(), "John Smith");
        assertEquals(individual.getCustomerType(), CustomerType.INDIVIDUAL);
    }

    @Test
    public void testToString() {
        String expectedString = "Individual{" +
                                "customerId=" + individual.getCustomerId() +
                                ", customerName='" + individual.getCustomerName() + '\'' +
                                ", customerType=" + individual.getCustomerType() +
                                '}';
        assertEquals(individual.toString(), expectedString);
    }
}
