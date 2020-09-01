import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student otherStudent;

    @Before
    public void setUp() {
        student = new Student("someName", 0);
        otherStudent = new Student("someOtherName", 1);
        student.addGrade(99);
        student.addGrade(80);
        student.addGrade(85);
        student.addGrade(79);
    }

    @Test
    public void testStudentConstructor() {
        assertEquals(0, student.getId());
        assertEquals("someName", student.getName());
        assertTrue(otherStudent.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
        assertFalse(student.getGrades().isEmpty());
    }

    @Test
    public void testGetGradeAverage() {
        assertEquals(85.75, student.getGradeAverage(), 0.00);
    }
}
