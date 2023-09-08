package Modules;

import java.util.HashMap;

public class Gradebook {
    HashMap<Course, Integer> grades = new HashMap<Course, Integer>();
    Student student;
    public Gradebook(Student student) {
        this.student = student;
    }
    public void addGrade(Course course, int grade) {
        grades.put(course, grade);
    }
    public double getGPA() {
        double total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }
}
