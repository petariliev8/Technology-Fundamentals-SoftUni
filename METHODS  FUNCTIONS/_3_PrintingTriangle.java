package Fundamentals._12_Functions;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int num = Integer.parseInt(sc.nextLine());



        for (int i = 1; i <= num; i++) {
            printLine(i);
        }
        for (int i = num-1; i >0 ; i--) {
            printLine(i);
        }


    }

    private static void printLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

