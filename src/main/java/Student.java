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

    // getId method
    public long getId() {
        return id;
    }

    // getName method
    public String getName() {
        return name;
    }
}
