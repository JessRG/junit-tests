import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohort = new Cohort();

//    A Cohort instance can add a Student to the List of students.
    @Test
    public void testAddStudent() {
        cohort.addStudent(new Student(0, "someStudentName"));
        assertEquals(2, cohort.getStudents().size());
    }

//    A Cohort instance can get the current List of students.

//    A Cohort instance can get the average, and it's being calculated correctly.
}
