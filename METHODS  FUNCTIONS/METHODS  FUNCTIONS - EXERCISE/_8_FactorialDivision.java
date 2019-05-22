package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _8_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        factorial(first,second);


    }
    public static void factorial (double first, double second) {
        double sumFirst = 1;
        double sumSecond = 1;

        for (int i = 1; i <=first ; i++) {
            sumFirst =sumFirst*i;
        }
        for (int i = 1; i <=second ; i++) {
            sumSecond *=i;
        }
        System.out.printf("%.2f",(sumFirst/sumSecond));
    }
}

