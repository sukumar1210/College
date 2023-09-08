package Modules;
public class OS implements Course{
    static public Enrollment enrollment;
    // static {
    //     enrollment = new Enrollment();
    // }
    public String getCourseCode(){
        return "CS-101";
    }
    public String getCourseTitel(){
        return "Operating System";
    }
    public int getCreditHour(){
        return 3;
    }
}
