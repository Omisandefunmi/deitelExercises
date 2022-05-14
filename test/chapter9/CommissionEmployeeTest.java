package chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionEmployeeTest {

    @Test
    public void testThatCommissionEmployeeExists(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        assertNotNull(commissionEmployee);
    }

    @Test
    public void testThatCommissionEmployeeHasFirstName(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setFirstName("Ada");
        assertEquals("Ada", commissionEmployee.getFirstName());
    }

    @Test
    public void testThatCommissionEmployeeHasSecondName(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setSecondName("Ada");
        assertEquals("Ada", commissionEmployee.getSecondName());
    }

    @Test
    public void testThatCommissionEmployeeHasSocialSecurityNumber(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setSocialNumber("Ada");
        assertEquals("Ada", commissionEmployee.getSocialNumber());
    }

    @Test
    public void testThatCommissionEmployeeHasGrossPay(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setGrossPay(100.00);
        assertEquals(100.00, commissionEmployee.getGrossPay());
    }


    @Test
    public void testThatGrossPayCannotBeLessThanZero(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setGrossPay(-1.0);
//        assertThrows(IllegalArgumentE)
    }


    @Test
    public void testThatCommissionEmployeeHasCommissionRate(){
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setCommissionRate(100.00);
        assertEquals(100.00, commissionEmployee.getCommissionRate());
    }

}
