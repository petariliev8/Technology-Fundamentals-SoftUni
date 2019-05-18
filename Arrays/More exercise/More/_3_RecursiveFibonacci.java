package Fundamentals._10_Exercise_ARRAYS.MoreExercise;

import java.util.Scanner;

public class _3_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());


        long[] fibonacci = new long[num];

        if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.println(1);
        } else if(2<num && num<=50) {

            for (int i = 2; i < num; i++) {

                fibonacci[0] = 1;
                fibonacci[1] = 1;
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];


            }

            System.out.print(fibonacci[fibonacci.length - 2] + fibonacci[fibonacci.length - 3]);
        } else if(num<=0){
            System.out.println(0);
        }

    }
}

