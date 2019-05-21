package Fundamentals._12_Functions;

import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = Integer.parseInt(sc.nextLine());
    char a = sc.nextLine().charAt(0);
    int second = Integer.parseInt(sc.nextLine());

    switch (a) {
        case '+':
            System.out.println( add(first,second));
            break;
        case '-':
            System.out.println( subtract(first,second));
            break;
        case '*':
            System.out.println( multiply(first,second));
            break;
        case '/':
            System.out.println( divide(first,second));
            break;
    }


    }
    private static int add (int first,int second) {
        int result = first+second;
        return result;
    }
    private static int subtract (int first,int second) {
        int result = first-second;
        return result;
    }
    private static int multiply (int first,int second) {
        int result = first*second;
        return result;
    }
    private static int divide (int first,int second) {
        int result = first/second;
        return result;
    }
}

