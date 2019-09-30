package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Martin", "CC21114G", 18000);
    }

    @Test
    public void hasName() {
        assertEquals("Martin", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("CC21114G", databaseAdmin.getNiNumber());
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
    public void canRaiseSalary_NotIfNegative(){
        //WHEN user types in negative
        databaseAdmin.raiseSalary(-100);
        //THEN salary should not have gone up
        assertEquals(18000, databaseAdmin.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        //WHEN
        databaseAdmin.payBonus();
        //THEN
        assertEquals(180, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        //WHEN we change the name
        databaseAdmin.setName("Kyle");
        //THEN
        assertEquals("Kyle", databaseAdmin.getName());
    }

    @Test
    public void canChangeName_NotIfNull(){
        //WHEN we change the name
        databaseAdmin.setName("");
        //THEN
        assertEquals("Martin", databaseAdmin.getName());
    }


}
