package JavaBasics.Exercise7;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int lastCourse = persons%capacity;
        int fullCourses = persons/capacity;
        if (fullCourses<1) {
            fullCourses = 1;
            System.out.println("1");
        } else {
           if (lastCourse>0) {
               System.out.println(fullCourses+1);
           } else {
               System.out.println(fullCourses);
           }
        }

    }
}

