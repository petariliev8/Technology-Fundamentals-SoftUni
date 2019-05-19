package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= input; i++) {
            if (i < 2) {
                System.out.println(i);
            } else {
                int counter = i;
                if (i > 1) {
                    while (counter >= 1) {
                        counter--;
                        System.out.print(i + " ");

                    }
                    System.out.println();
                }
            }
        }
    }
}

