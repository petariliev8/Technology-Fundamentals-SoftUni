package Fundamentals._6_DataTypeAndVariables;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounts = Double.parseDouble(scanner.nextLine());
        double dollars = pounts*1.31;

        System.out.printf("%.2f",Math.pow(dollars,5));
    }
}

