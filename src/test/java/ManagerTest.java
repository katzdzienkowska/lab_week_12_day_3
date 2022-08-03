import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John Smith", "ABC123", 30000, "Clothing");
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("ABC123", manager.getNiNumber());}

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDept() {
        assertEquals("Clothing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, manager.payBonus(), 0.0);
    }

    @Test
    public void cantRaiseSalaryNegatively() {
        manager.raiseSalary(-1000);
        assertEquals(30000, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeName() {
        manager.setName("James Bond");
        assertEquals("James Bond", manager.getName());
    }
}
