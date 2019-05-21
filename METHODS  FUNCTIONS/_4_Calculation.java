package Fundamentals._12_Functions;

import java.util.Scanner;

public class _4_Calculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
switch (command) {
    case "add":
        System.out.println(add(first,second));
    break;
    case "subtract":
        System.out.println(subtract(first,second));
        break;
    case "multiply":
        System.out.println(multiply(first,second));
        break;
    case "divide":
        System.out.println(divide(first,second));
        break;
}
    }
    public static int add(int first, int second) {
        int add =first+second;

        return add;
    }
    public static int subtract(int first, int second) {
        int subtract =first-second;

        return subtract;
    }
    public static int multiply(int first, int second) {
        int multiply =first*second;

        return multiply;
    }
    public static int divide(int first, int second) {
        int divide =first/second;

        return divide;
    }
}

