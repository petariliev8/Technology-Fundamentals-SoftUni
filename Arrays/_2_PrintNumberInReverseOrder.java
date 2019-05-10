package Fundamentals._9_Arrays;

import java.util.Scanner;

public class PrintNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int array [] = new int[n];
        int length = array.length;
        for (int i = 0; i < length ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = length; i > 0; i--) {
            System.out.print(array[i-1]+" ");
        };
    }
}

