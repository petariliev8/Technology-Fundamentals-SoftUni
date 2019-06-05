package Fundamentals._18_ObjectsClasses.tests;

public class TestClass {
    private String firstname ;
    private String lastName;
   private int age;
   private  String  university;

   /* public String information (String firstname, String lastName, int age,String university ){
    String info = firstname+lastName+age+university;
        return info;
    }*/



    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}

