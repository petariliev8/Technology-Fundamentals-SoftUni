package Fundamentals._12_Functions;

import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        String first = sc.nextLine();
        String second = sc.nextLine();
        switch (type) {
            case "int":
                System.out.println(integer(Integer.parseInt(first), Integer.parseInt(second)));
                break;
            case "String":
                System.out.println(strings(first, second));
                break;
            case "char":
                System.out.println(chars(first, second));
                break;
        }
    }

    public static int integer(int first, int second) {
        int result = 0;
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    public static String strings(String first, String second) {
        int result = 0;
        int sumfirst = 0;
        int sumsecond = 0;
        for (int i = 0; i < first.length(); i++) {
            sumfirst = first.charAt(i) + sumfirst;
        }
        for (int i = 0; i < second.length(); i++) {
            sumsecond = second.charAt(i) + sumsecond;
        }

        if (sumsecond >= sumfirst) {
            return first;
        } else {
            return second;
        }
    }

    public static String chars(String first, String second) {
        int result = 0;
        if ((char) first.charAt(0) >= (char) second.charAt(0)) {
            return first;
        } else {
            return second;
        }
    }


}
