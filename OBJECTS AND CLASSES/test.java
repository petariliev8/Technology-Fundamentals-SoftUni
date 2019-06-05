package Fundamentals._18_ObjectsClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
   static class Person {
        String name;
        String lastName;
        int age;
        String EGN;

       public Person(String name, String lastName, int age, String EGN) {
           this.name = name;
           this.lastName = lastName;
           this.age = age;
           this.EGN = EGN;
       }
       public  String getName (){
           return name;
       }
   }
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person pesho = new Person("pesho", "Iliev", 23, "124151");
        //Person gosho = new Person();



        System.out.println(pesho.getName());



    }

}


