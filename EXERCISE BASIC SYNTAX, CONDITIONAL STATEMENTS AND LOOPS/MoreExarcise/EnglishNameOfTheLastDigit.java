package Fundamentals._4_EcerciseBasic.MoreExarcise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input =Integer.parseInt(scanner.nextLine());

        int last = input%10;

        switch (last) {
            case 1:
                System.out.printf("one");
                break;
            case 2:
                System.out.printf("two");
                break;
            case 3:
                System.out.printf("three");
                break;
            case 4:
                System.out.printf("four");
                break;
            case 5:
                System.out.printf("five");
                break;
            case 6:
                System.out.printf("six");
                break;
            case 7:
                System.out.printf("seven");
                break;
            case 8:
                System.out.printf("eight");
                break;
            case 9:
                System.out.printf("nine");
                break;
            case 0:
                System.out.printf("zero");
                break;
        }

    }
}

