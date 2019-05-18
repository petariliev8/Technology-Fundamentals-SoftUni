package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int counter = 0;
        int counterEquals = 0;

        int[] arrInt = Arrays.stream(input)
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        for (int j = 0; j < arrInt.length; j++) {
            for (int i = arrInt.length - 1; i > 0; i--) {
                if (j <= i) {
                    if (arrInt[j] < arrInt[i]) {
                        counter++;

                    } else if (arrInt[j] == arrInt[i]) {  // ако са равни , да изкара само последното !!!
                        if (j >= i) {

                        } else {
                            counterEquals++;
                        }
                    }
                }

            }

            if ((counter == 0) && (counterEquals == 0)) {
                System.out.print(arrInt[j] + " ");
            } else if ((counter == 0) && (counterEquals > 0)) {

            }
            counter = 0;
            counterEquals = 0;
        }
    }

}


