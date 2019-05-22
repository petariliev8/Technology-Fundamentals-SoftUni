package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        countTheVowels(text);
    }

    public static void countTheVowels(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {

            if ((a.charAt(i) == 'a') ||
                    (a.charAt(i) == 'e') ||
                    (a.charAt(i) == 'i') ||
                    (a.charAt(i) == 'o') ||
                    (a.charAt(i) == 'u') ||
                    (a.charAt(i) == 'A') ||
                    (a.charAt(i) == 'E') ||
                    (a.charAt(i) == 'I') ||
                    (a.charAt(i) == 'O') ||
                    (a.charAt(i) == 'U')) {
                count++;
            }


        }
        System.out.println(count);

    }
}

