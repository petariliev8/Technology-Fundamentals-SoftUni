package Fundamentals._12_Functions;

import java.util.Scanner;

public class _10_MultyplyEvensByOdds {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = Integer.parseInt(sc.nextLine());
    int length =String.valueOf(input).length();
    int sumEven = 0;
    int sumOdd = 0;

        for (int i = 0; i <length ; i++) {
            if ((input%10)%2==0) {
                sumEven+=input%10;
            } else {
                sumOdd+=input%10;
            }
            input =input/10;
        }

        System.out.println(even(sumEven,sumOdd));

    }
    public static int even (int sumEven , int sumOdd) {
        int result = sumEven*sumOdd;

        return result;
    }
}

