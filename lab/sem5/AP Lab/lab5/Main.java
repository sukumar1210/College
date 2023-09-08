import Modules.*;
public class Main {
    public static void main(String[] args) {
        Student Ram = new Student(1, "Astha", "Ashtha@gmail.com", 23101, "CS");
        Student Sita = new Student(2, "Sita", "Sita@gmail.com", 23102, "CS");
        Faculty Gita = new Faculty(1, "Gita", "Gita@gmail.com", "F101", "CS");
        DBMS dbms = new DBMS();
        DS ds = new DS();
        OS os = new OS();
        DBMS.enrollment.Enroll(Ram);
        DS.enrollment.Enroll(Ram);
        OS.enrollment.Enroll(Sita);
        DS.enrollment.Enroll(Sita);
        System.out.println("Course Code: " + dbms.getCourseCode() + "\nCourse Title: " + dbms.getCourseTitel() + "\nCredit Hour: " + dbms.getCreditHour());
        System.out.println("Course Code: " + ds.getCourseCode() + "\nCourse Title: " + ds.getCourseTitel() + "\nCredit Hour: " + ds.getCreditHour());
        Ram.enterGrade(ds, 9);
        Ram.enterGrade(dbms, 8);
        System.out.println("Student Name: " + Ram.getName() + "\nStudent ID: " + Ram.getId() + "\nStudent Email: " + Ram.getEmail() + "\nStudent Roll: " + Ram.getStudentID() + "\nStudent Department: " + Ram.getDepartment() + "\nStudent CGPA: " + Ram.getGPA());
        Sita.enterGrade(ds, 8);
        Sita.enterGrade(os, 7);
        System.out.println("Student Name: " + Sita.getName() + "\nStudent ID: " + Sita.getId() + "\nStudent Email: " + Sita.getEmail() + "\nStudent Roll: " + Sita.getStudentID() + "\nStudent Department: " + Sita.getDepartment() + "\nStudent CGPA: " + Sita.getGPA());
    }
}
