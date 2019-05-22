package Fundamentals._13_ExerciseMethods.MoreExercise;

import java.util.Scanner;

public class _5_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double third = Double.parseDouble(scanner.nextLine());

        checkPositivNegativZero(first, second, third);

    }

    private static void checkPositivNegativZero(double first, double second, double third) {
        int countNegativ =0;
        if (first==0 || second==0 || third==0) {
            System.out.println("zero");
        } else {
          if (first<0){
              countNegativ++;
          }
            if(second<0){
                countNegativ++;
            }
            if (third<0){
                countNegativ++;
            }
            if (countNegativ==0 || countNegativ==2) {
                System.out.println("positive");
            }else if(countNegativ==1 || countNegativ==3){
                System.out.println("negative");
            }

        }

    }
}

