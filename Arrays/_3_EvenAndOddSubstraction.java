package Fundamentals._9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int sumEven = 0;
        int sumOdd = 0;

        int [] arrayNum = Arrays.stream(input)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int length = arrayNum.length;
        for (int i = 0; i <length ; i++) {

            if (arrayNum[i]%2==0) {
                sumEven+=arrayNum[i];
            } else if (arrayNum[i]%2!=0) {
                sumOdd+=arrayNum[i];
            }

        }

        System.out.println(sumEven-sumOdd);

    }
}

