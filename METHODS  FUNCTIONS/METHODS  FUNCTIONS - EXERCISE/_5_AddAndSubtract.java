package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        addSubtract(first,second,third);


    }
    public static void addSubtract (int first , int second , int third){
        System.out.println((first+second)-third);

    }
}

