/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.mybank.Employee;
import com.itexpert.homework.mybank.EmployeeType;
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
public class EmployeeTest {
    Employee employee;
    public EmployeeTest() {
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
    employee = new Employee(101, "John Doe", EmployeeType.FULLTIME);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testEmployeeID(){
        assertEquals(employee.getEmployeeID(), 101);
        employee.setEmployeeID(102);
        assertEquals(employee.getEmployeeID(), 102);
    }
     @Test
    public void testEmployeeName(){
        assertEquals(employee.getEmployeeName(), "John Doe");
        employee.setEmployeeName("Amy");
         assertEquals(employee.getEmployeeName(), "Amy");
    }
     @Test
    public void testEmployeeType(){
        assertEquals(employee.getEmployeeType(),  EmployeeType.FULLTIME);
        employee.setEmployeeType(EmployeeType.FULLTIME);
         assertEquals(employee.getEmployeeType(), EmployeeType.FULLTIME);
    }
     @Test
    public void testEmployeeToString() {
        String expected = "Employee{employeeID=101, employeeName='John Doe', employeeType=FULLTIME}";
         assertEquals(employee.toString(), expected);
    }
}
