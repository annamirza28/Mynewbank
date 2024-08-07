/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.Contractor;
import com.itexpert.homework.mybank.EmployeeType;
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
public class ContractorTest {
    Contractor contractor;
    public ContractorTest() {
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
        contractor = new Contractor(201, "Miriam Joe");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        contractor = null;
    }
     @Test
    public void testConstructor() {
        assertEquals(contractor.getEmployeeID(), 201);
        assertEquals(contractor.getEmployeeName(), "Miriam Joe");
        assertEquals(contractor.getEmployeeType(), EmployeeType.CONTRACTOR);
    }
    @Test
    public void testToString() {
        String expectedString = "Contractor{" +
                                "employeeID=" + contractor.getEmployeeID() +
                                ", employeeName='" + contractor.getEmployeeName() + '\'' +
                                ", employeeType=" + contractor.getEmployeeType() +
                                '}';
        assertEquals(contractor.toString(), expectedString);
    }
}
