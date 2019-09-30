package staff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Martin", 98765, 18000);
    }

    @Test
    public void hasName() {
        assertEquals("Martin", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(98765, databaseAdmin.getNiNumber(), 0.01);
    }

    @Test
    public void hasSalary() {
        assertEquals(18000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        //WHEN
        databaseAdmin.raiseSalary(200);
        //THEN
        assertEquals(18200, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        //WHEN
        databaseAdmin.payBonus();
        //THEN
        assertEquals(180, databaseAdmin.payBonus(), 0.01);
    }


}
