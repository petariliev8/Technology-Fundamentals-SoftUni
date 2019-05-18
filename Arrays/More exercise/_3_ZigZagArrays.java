package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        int outputCounter = lines;
        int counter = 0;
        int i = 0;
        int k = 0;
        int[] newTwo = new int[outputCounter];
        int[] newOne = new int[outputCounter];

        while (lines * 2 > 0) {


            String[] first = sc.nextLine().split(" ");

            int[] firstInteger = Arrays.stream(first)
                    .mapToInt(e -> Integer.parseInt(e)).toArray();


            for (int j = 0; j < firstInteger.length; j++) {
                if ((counter % 2 == 0)) {
                    if (j % 2 == 0) {

                        newOne[i] = firstInteger[j];
                        i++;
                    } else if (j % 2 != 0) {
                        newTwo[k] = firstInteger[j];
                        k++;


                    }
                } else if (counter % 2 != 0) {
                    if (j % 2 != 0) {

                        newOne[i] = firstInteger[j];
                        i++;
                    } else if (j % 2 == 0) {
                        newTwo[k] = firstInteger[j];
                        k++;


                    }
                }


            }


            lines--;
            counter++;
        }
        for (int j = 0; j < newOne.length; j++) {
            System.out.print(newOne[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < newTwo.length; j++) {
            System.out.print(newTwo[j] + " ");
        }
    }
}


