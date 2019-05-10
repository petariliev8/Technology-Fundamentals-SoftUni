package Fundamentals._9_Arrays;

import java.util.Scanner;

public class _5_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] first = input.split(" ");
        int sum =0;

        int [] numbers =new int[first.length];
        for (int i = 0; i <first.length ; i++) {
             numbers [i] = Integer.parseInt(first[i]);
        }


        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]%2==0) {
                 sum  +=  numbers[i];
            }


        }
        System.out.print(sum);
    }
}

