package Modules;
public class Faculty extends Person{
    String facultyId = new String();
    String department = new String();
    public Faculty(){}
    public Faculty(int id, String name, String email, String facultyId, String department){
        super(id, name, email);
        this.facultyId = facultyId;
        this.department = department;
    }
}
