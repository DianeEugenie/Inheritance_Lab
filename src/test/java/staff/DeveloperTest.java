package staff;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Billy", 34567, 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Kev", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(12345, developer.getNiNumber(), 0.01);
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        //WHEN
        developer.raiseSalary(200);
        //THEN
        assertEquals(20200, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        //WHEN
        developer.payBonus();
        //THEN
        assertEquals(200, developer.payBonus(), 0.01);
    }
}
