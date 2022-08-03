import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Alan White", "QRS678", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Alan White",developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("QRS678", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(26000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, developer.payBonus(), 0.01);
    }

    @Test
    public void cantRaiseSalaryNegatively() {
        developer.raiseSalary(-1000);
        assertEquals(25000, developer.getSalary(), 0.0);
    }

    @Test
    public void canChangeName() {
        developer.setName("Bob Lucas");
        assertEquals("Bob Lucas", developer.getName());
    }
}
