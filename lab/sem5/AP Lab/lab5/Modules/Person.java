package Modules;
public abstract class Person{
    int id;
    String name = new String();
    String email= new String();
    public Person(){}
    public Person(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getId(){
        return this.id;
    }
}