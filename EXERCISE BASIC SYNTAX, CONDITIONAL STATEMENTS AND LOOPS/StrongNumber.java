package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int num = input;
        int num2 = 1;
        int sum = 0;
        int length = String.valueOf(num).length();
        for (int j = length; j > 0; j--) {
            int sumnum = num % 10;


            for (int i = 1; i < sumnum; i++) {
                num2 = num2 * (i + 1);

            }
            sum += num2;
            num = num / 10;
            num2 = 1;


        }
        if (sum == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

