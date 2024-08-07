/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.EmployeeType;
import com.itexpert.homework.mybank.FullTime;
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
public class FullTimeTest {
    FullTime fullTime;
    public FullTimeTest() {
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
     fullTime = new FullTime(301, "Alice Smith");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         fullTime = null;
    }
    @Test
    public void testFullTime() {
        assertEquals(fullTime.getEmployeeID(), 301);
        assertEquals(fullTime.getEmployeeName(), "Alice Smith");
        assertEquals(fullTime.getEmployeeType(), EmployeeType.FULLTIME);
    }
     @Test
    public void testToString() {
        String expectedString = "FullTime{" +
                                "employeeID=" + fullTime.getEmployeeID() +
                                ", employeeName='" + fullTime.getEmployeeName() + '\'' +
                                ", employeeType=" + fullTime.getEmployeeType() +
                                '}';
        assertEquals(fullTime.toString(), expectedString);
    }
}
