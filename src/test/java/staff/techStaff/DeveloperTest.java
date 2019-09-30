package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Billy", "CC31114G", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Billy", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("CC31114G", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        //WHEN
        developer.raiseSalary(200);
        //THEN
        assertEquals(20200, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary_NotIfNegative(){
        //WHEN user types in negative
        developer.raiseSalary(-100);
        //THEN salary should not have gone up
        assertEquals(20000, developer.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        //WHEN
        developer.payBonus();
        //THEN
        assertEquals(200, developer.payBonus(), 0.01);
    }
}
