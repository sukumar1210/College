package Modules;

import java.util.ArrayList;

public class Enrollment {
    ArrayList<Student> students = new ArrayList<>();
    Course course;
    public void Enroll(Student student){
        this.students.add(student);
    }
}
