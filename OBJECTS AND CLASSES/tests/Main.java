package Fundamentals._18_ObjectsClasses.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<TestClass> studentList = new ArrayList<>();

    TestClass student = new TestClass();

    String end = "";
while (!end.equals("end")) {
    String firstname = scanner.nextLine();
    String lastname = scanner.nextLine();
    int age = Integer.parseInt(scanner.nextLine());
    String university = scanner.nextLine();


            studentList.add(student);

            System.out.println(student.getFirstname());

            end = scanner.nextLine();
        }

        for (int i = 0; i < studentList.size(); i++) {

            System.out.println();
        }

    }
}

