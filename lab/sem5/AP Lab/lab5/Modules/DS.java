package Modules;
public class DS implements Course{
    static public Enrollment enrollment;
    // static {
    //     enrollment = new Enrollment();
    // }
    public String getCourseCode(){
        return "CS-201";
    }
    public String getCourseTitel(){
        return "Data Structures";
    }
    public int getCreditHour(){
        return 3;
    }
}
