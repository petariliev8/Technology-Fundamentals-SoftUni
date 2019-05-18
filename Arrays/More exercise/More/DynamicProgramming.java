package Fundamentals._10_Exercise_ARRAYS.MoreExercise;

import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  String input = "3 14 5 12 15 7 8 9 11 10 1";

  String [] arrInput = input.split(" ");

        int first = 5;
        int second = 10;

        System.out.println(area(first));


    }

    public static int area(int a) {
        int area = a*a;
        return area;
    }
}

