package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _3_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if ( first > second) {
            char temp = first;
             first = second;
             second=temp;
        }

        allSymbols(first, second);

    }
    private static void allSymbols ( char first, char second){


        for (int i = first + 1; i < second; i++) {
            System.out.print((char) i + " ");
        }


    }
}