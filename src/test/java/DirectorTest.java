import org.junit.Before;
import org.junit.Test;
import staff.management.Director;


import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jane Doe", "SFD324", 80000, "Tech", 100000);
    }

    @Test
    public void hasName() {
        assertEquals("Jane Doe", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("SFD324", director.getNiNumber());}

    @Test
    public void hasSalary() {
        assertEquals(80000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDept() {
        assertEquals("Tech", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(4000);
        assertEquals(84000, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1600, director.payBonus(), 0.0);
    }

    @Test
    public void cantRaiseSalaryNegatively() {
        director.raiseSalary(-1000);
        assertEquals(80000, director.getSalary(), 0.0);
    }

    @Test
    public void canChangeName() {
        director.setName("Bob Anderson");
        assertEquals("Bob Anderson", director.getName());
    }
}
