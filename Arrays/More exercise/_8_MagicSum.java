package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int num = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int first = 0;
        int second = 0;

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 1; j < input.length; j++) {
                if (j > i) {

                    sum = input[i] + input[j];

                    if (sum == num) {

                        first = input[i];
                        second = input[j];

                        System.out.print(first + " " + second);
                        System.out.println();
                        first = 0;
                        second = 0;
                    }
                }
            }

        }


    }

}















