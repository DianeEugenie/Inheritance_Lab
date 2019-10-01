package management;

import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Kev", "CC11114G", 35000.50, "The Alphas");
    }

    @Test
    public void hasName() {
        assertEquals("Kev", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("CC11114G", manager.getNiNumber());
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
    public void canRaiseSalary_NotIfNegative(){
        //WHEN user types in negative
        manager.raiseSalary(-100);
        //THEN salary should not have gone up
        assertEquals(35000.50, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        //WHEN
        manager.payBonus();
        //THEN
        assertEquals(350, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        //WHEN we change the name
        manager.setName("Kyle");
        //THEN
        assertEquals("Kyle", manager.getName());
    }

    @Test
    public void canChangeName_NotIfNull(){
        //WHEN we change the name
        manager.setName("");
        manager.setName(null);
        //THEN
        assertEquals("Kev", manager.getName());
    }

}
