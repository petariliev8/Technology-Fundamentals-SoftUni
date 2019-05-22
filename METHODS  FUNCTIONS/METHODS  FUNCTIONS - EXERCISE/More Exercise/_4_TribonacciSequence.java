package Fundamentals._13_ExerciseMethods.MoreExercise;

import java.util.Scanner;

public class _4_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        numsTribonacci(num);


    }

    private static void numsTribonacci(int num) {

        int [] tribonacci = new int[num];

        for (int i = 0; i <num ; i++) {
            tribonacci[i]=1;
        }
        for (int i = 0; i <num; i++) {
            if (i==2){
                tribonacci[i]=tribonacci[i-1]+tribonacci[i-2];
            }else if (i>2) {
                tribonacci[i]=tribonacci[i-1]+tribonacci[i-2]+tribonacci[i-3];
            }
            System.out.print(tribonacci[i]+" ");
        }
    }
}

