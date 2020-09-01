import java.util.ArrayList;

public class Student {
    // id property
    private long id;

    // name property
    private String name;

    // grades property
    private ArrayList<Integer> grades;

    // Student Constructor
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // getId method: returns the student's id
    public long getId() {
        return id;
    }

    // getName method: returns the student's name
    public String getName() {
        return name;
    }

    // getGrades method: returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // addGrade method: adds the given grade to the list
    public void addGrade(int grade) {
        grades.add(grade);
    }
}
