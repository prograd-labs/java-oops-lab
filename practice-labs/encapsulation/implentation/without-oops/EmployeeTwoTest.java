import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeTwoTest {

    @Test
    void checkForPositiveValueForAge(){
        EmployeeTwo employeeTwo = new EmployeeTwo();

        employeeTwo.age = 20;
        int actualValue = employeeTwo.displayAge();
        int expectedValue = 20;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForNegativeValueForAge(){
        EmployeeTwo employeeTwo = new EmployeeTwo();

        employeeTwo.age = -20;
        int actualValue = employeeTwo.displayAge();
        int expectedValue = -20;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForPositiveValueForSalary(){
        EmployeeTwo employeeTwo = new EmployeeTwo();

        employeeTwo.salary = 20000;
        int actualValue = employeeTwo.displaySalary();
        int expectedValue = 20000;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForNegativeValueForSalary(){
        EmployeeTwo employeeTwo = new EmployeeTwo();

        employeeTwo.salary = -20000;
        int actualValue = employeeTwo.displaySalary();
        int expectedValue = -20000;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void checkForForName(){
        EmployeeTwo employeeTwo = new EmployeeTwo();

        employeeTwo.name = "AnythingCanBeGiven";
        String actualValue = employeeTwo.displayName();
        String expectedValue = "AnythingCanBeGiven";

        assertEquals(expectedValue,actualValue);

    }


}
