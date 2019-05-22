package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
allNumbers(input);
    }

    public static void allNumbers(int input) {

        for (int i = 0; i <= input; i++) {
        int length =String.valueOf(i).length();
            int countOdd = 0;
            int sum =0;
            int useNumber = i;
            for (int j = 0; j <length ; j++) {
               sum +=useNumber%10;


                if ((i%10)%2!=0) {
                    countOdd++;
                }
                useNumber=useNumber/10;
            }
            if (sum%8==0 && countOdd>0){
                System.out.println(i);
            }
        }
    }

}