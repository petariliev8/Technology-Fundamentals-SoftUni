package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
makeArr(num);

    }
    public static void makeArr  (int num) {

        int [] output = new int [num];

        for (int i = 0; i <num ; i++) {
            for (int j = 0; j <num ; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

