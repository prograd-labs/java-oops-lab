import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeOneTest {

    @Test
    void checkForPositiveValueForAge() throws Exception {
        EmployeeOne employeeOne = new EmployeeOne();

        employeeOne.setAge(20);
        int actualValue = employeeOne.getAge();
        int expectedValue = 20;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForNegativeValueForAge() throws Exception{
        EmployeeOne employeeOne = new EmployeeOne();

        Exception thrown = Assertions
                .assertThrows(Exception.class, () -> {
                    employeeOne.setAge(-20);
                });

        String actualValue = thrown.getMessage();
        String expectedValue = "Invalid Age";

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForPositiveValueForSalary() throws Exception{
        EmployeeOne employeeOne = new EmployeeOne();

        employeeOne.setSalary(20000);
        int actualValue = employeeOne.getSalary();
        int expectedValue = 20000;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForNegativeValueForSalary() throws Exception{
        EmployeeOne employeeOne = new EmployeeOne();

        Exception thrown = Assertions
                .assertThrows(Exception.class, () -> {
                    employeeOne.setSalary(-20000);
                });

        String actualValue = thrown.getMessage();
        String expectedValue = "Invalid Salary";

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForForName() throws Exception{
        EmployeeOne employeeOne = new EmployeeOne();

        employeeOne.setName("Sethu");
        String actualValue = employeeOne.getName();
        String expectedValue = "Sethu";

        assertEquals(expectedValue,actualValue);

    }


}
