package JavaBasics.Exercise7;

import java.util.Scanner;

public class _2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int length =String.valueOf(input).length();

        for (int i = 0; i < length; i++) {
            int lastDigit = input%10;

             sum = sum+lastDigit;


            input = input/10;
        }




        System.out.print(sum);


    }
}

