package Fundamentals._18_ObjectsClasses._5_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Student> people = new ArrayList<>();

        String input = scanner.nextLine();

        while(true) {

            if (input.equals("end")){
                break;
            }
                String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];


            Student student = new Student(firstName, lastName, age, homeTown);

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(homeTown) ;

            people.add(student);

             input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student:people) {
            if (city.equals(student.getHomeTown())){

                System.out.println(student.getFirstName()+" "+student.getLastName()+" is "+student.getAge()+" years old");


            }


        }




    }
}

