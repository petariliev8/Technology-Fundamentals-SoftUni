package Fundamentals._6_DataTypeAndVariables;

import java.util.Scanner;

public class SpacialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());


        int lastNum = input;
        int sum = 0;
        int newI = 0;


        for (int i = 1; i <= input; i++) {

            int length =String.valueOf(i).length();
            lastNum = i;
        for (int j = 0; j < length ; j++) {

            lastNum = lastNum % 10;
            sum = sum + lastNum;
             lastNum = i/10;

        }
            if ((sum == 5) || (sum == 7) || (sum == 11)) {
                System.out.println(i+" -> True");
            } else {
                System.out.println(i+" -> False");
            }
            sum = 0;


        }





    }
}

