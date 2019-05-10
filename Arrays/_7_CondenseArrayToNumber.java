package Fundamentals._9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _7_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");

        int [] numbers = Arrays.stream(input)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int length = numbers.length;
        int sum = 0;

        if (length>2) {  // Проверка дали масива е по малко или равно на 2
                         // директно ги събира , ако е едно го принтва.

            while (length > 2) {
                sum = 0;
                for (int i = 0; i < length - 1; i++) {
                    sum += numbers[i] + numbers[i + 1];

                    numbers[i] = numbers[i] + numbers[i + 1];
                }

                sum += 0;   // нулираме всеки път , само последния принтираме.
                length -= 1;
            }

            System.out.println(sum);
        } else {                        // ако са две или 1 число !
            if (length>1) {
                sum = numbers[0] + numbers[1];
                System.out.println(sum);
            } else {
                sum =  numbers[0];
                System.out.println(sum);
            }

        }
    }
}

