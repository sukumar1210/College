package Modules;
// import Modules.*;
public class Student extends Person {
    int studentID;
    String major = new String();
    Gradebook gradebook;
    {
         this.gradebook = new Gradebook(this);
    }
    public Student(){}
    public Student(int id, String name, String email, int studentID, String major){
        super(id, name, email);
        this.studentID = studentID;
        this.major = major;
    }
    public void enterGrade(Course course, int grade) {
        gradebook.addGrade(course, grade);
    }
    public double getGPA() {
        return gradebook.getGPA();
    }
    public int getStudentID(){
        return this.studentID;
    }
    public String getMajor(){
        return this.major;
    }
    public String getDepartment(){
        return this.major;
    }
}
