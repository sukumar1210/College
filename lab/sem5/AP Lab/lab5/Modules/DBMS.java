package Modules;
public class DBMS implements Course{
    static public Enrollment enrollment;
    // static {
    //     enrollment = new Enrollment();
    // }
    public String getCourseCode(){
        return "CS-301";
    }
    public String getCourseTitel(){
        return "Database Management System";
    }
    public int getCreditHour(){
        return 3;
    }
}
