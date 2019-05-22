package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
textEven(input);

    }
    public static void textEven (String input){
        int length = input.length();
        if(length%2!=0){
            System.out.println(input.charAt(length/2));
        } else {
            System.out.print(input.charAt(length/2-1));
            System.out.print(input.charAt(length/2));
        }

    }
}

