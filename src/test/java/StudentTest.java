import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student("someName", 0);
    }

    @Test
    public void testStudentConstructor() {
        assertEquals(0, student.getId());
        assertEquals("someName", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(99);
        assertFalse(student.getGrades().isEmpty());
    }
}
