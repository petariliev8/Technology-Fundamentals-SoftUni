package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _4_ArrayRotation {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String [] arraysStr = sc.nextLine().split(" ");

    int rotation = Integer.parseInt(sc.nextLine());

    int [] arrayInt = Arrays.stream(arraysStr)
            .mapToInt(e -> Integer.parseInt(e)).toArray();



        for (int i = 0; i <arrayInt.length ; i++) {
            int count = i+rotation;
            if ( count>=arrayInt.length) {

                while (count>=arrayInt.length) {
                    count = Math.abs(count - arrayInt.length);
                }
            }
            System.out.print(arrayInt[count]+" ");
        }
    }
}

