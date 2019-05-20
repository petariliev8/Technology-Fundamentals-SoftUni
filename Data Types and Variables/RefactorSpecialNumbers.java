package Fundamentals._6_DataTypeAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int eachNum = 0;
        boolean verification = false;
        for (int i = 1; i <= input; i++) {
            eachNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            if ( (sum == 5) || (sum == 7) || (sum == 11)) {
                System.out.printf("%d -> True%n", eachNum);
                sum = 0;
                i = eachNum;
            } else  {
                System.out.printf("%d -> False%n", eachNum);
                sum = 0;
                i = eachNum;
            }

        }
    }
}

