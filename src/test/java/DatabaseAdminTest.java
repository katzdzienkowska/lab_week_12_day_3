import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("George White", "ABC456", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("George White", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("ABC456", databaseAdmin.getNiNumber());
    }


    @Test
    public void hasSalary() {
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(21000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, databaseAdmin.payBonus(), 0.0);
    }

    @Test
    public void cantRaiseSalaryNegatively() {
        databaseAdmin.raiseSalary(-1000);
        assertEquals(20000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Fraser Black");
        assertEquals("Fraser Black", databaseAdmin.getName());
    }
}
