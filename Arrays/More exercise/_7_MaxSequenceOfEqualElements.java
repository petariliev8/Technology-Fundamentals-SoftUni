package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _7_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int counter = 0;
        int maxEquals = 0;
        int equalElement = 0;
        int i , j = 0;

        for (i = 0, j = 1; i < numbers.length - 1; i++, j++) {

            if (numbers[i] == numbers[j]) {
                counter++;

            } else {
                if (counter > 0) {
                    counter++;

                    if (counter > maxEquals) {

                        maxEquals = counter;
                        equalElement = numbers[i];
                    }
                }
                counter = 0;
            }
        }
        if (equalElement == 0) {
            equalElement = numbers[i];
            maxEquals = counter;
            maxEquals++;
        }
        for (int k = 0; k < maxEquals; k++) {
            System.out.print(equalElement + " ");
        }
    }
}




