package Fundamentals._9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        int[] firstInt = Arrays.stream(firstArray)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] secondInt = Arrays.stream(secondArray)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int lengthFirst = firstArray.length;
        int lengthSecond = secondArray.length;
        int sum = 0;
        int index = 80;
        boolean test = true;
        for (int i = 0; i < lengthFirst && test; i++) {
            for (int j = 0; j < lengthSecond; j++) {
                if ((i == j) && (firstInt[i] != secondInt[j])) {
                        index = i;

                    System.out.println("Arrays are not identical. Found difference at "+index+" index");
                    test = false;

                    } else if ((i == j) && (firstInt[i] == secondInt[j])) {
                    sum+=firstInt[i];
                }
                }
            }
        if (index ==80){
            System.out.println("Arrays are identical. Sum: "+sum   );
        }

        }
    }

