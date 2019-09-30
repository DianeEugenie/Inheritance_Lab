package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Kev", 12345, 35000.50, "The Alphas");
    }

    @Test
    public void hasName() {
        assertEquals("Kev", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(12345, manager.getNiNumber(), 0.01);
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.50, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("The Alphas", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        //WHEN
        manager.raiseSalary(200.50);
        //THEN
        assertEquals(35201, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        //WHEN
        manager.payBonus();
        //THEN
        assertEquals(350, manager.payBonus(), 0.01);
    }

}
