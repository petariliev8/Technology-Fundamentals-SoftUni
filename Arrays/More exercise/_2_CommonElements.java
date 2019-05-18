package Fundamentals._10_Exercise_ARRAYS;

import java.util.Scanner;

public class _2_CommonElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] first = sc.nextLine().split(" ");
        String [] second =sc.nextLine().split(" ");

        for (int i = 0; i <first.length ; i++) {
            for (int j = 0; j <second.length ; j++) {

                if (first[i].equals(second[j])) {
                    System.out.print(first[i]+" ");
                }


            }
        }

    }
}

