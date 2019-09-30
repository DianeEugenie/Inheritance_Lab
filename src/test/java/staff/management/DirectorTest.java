package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Gillian", 45678, 80000, "All Departments", 1250000);
    }

    @Test
    public void hasName() {
        assertEquals("Gillian", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(45678, director.getNiNumber(), 0.01);
    }

    @Test
    public void hasSalary() {
        assertEquals(80000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("All Departments", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1250000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        //WHEN
        director.raiseSalary(1000);
        //THEN
        assertEquals(81000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        //WHEN
        director.payBonus();
        //THEN
        assertEquals(800, director.payBonus(), 0.01);
    }


}
