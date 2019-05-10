package Fundamentals._9_Arrays;

import java.util.Scanner;

public class _4_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String print = "";
        String [] letters = scanner.nextLine().split("");

        int sum = letters.length;
        for (int i = 0; i < sum/2; i++) {
             print = letters[i];
            letters[i] = letters[letters.length-1-i];
            letters[letters.length-1-i]=print;

        }


            System.out.println(String.join(" ",letters));


    }
}

