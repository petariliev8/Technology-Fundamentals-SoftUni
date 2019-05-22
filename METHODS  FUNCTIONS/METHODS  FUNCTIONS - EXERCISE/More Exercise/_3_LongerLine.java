package Fundamentals._13_ExerciseMethods.MoreExercise;

import java.util.Scanner;

public class _3_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double third = Double.parseDouble(scanner.nextLine());
        double fourth = Double.parseDouble(scanner.nextLine());
        double first2 = Double.parseDouble(scanner.nextLine());
        double second2 = Double.parseDouble(scanner.nextLine());
        double third2 = Double.parseDouble(scanner.nextLine());
        double fourth2 = Double.parseDouble(scanner.nextLine());

        longerLine(first,second,third,fourth,first2,second2,third2,fourth2);
    }
    public static double longerLine (double first, double second, double third, double fourth,double first2 , double  second2, double third2, double fourth2) {

        if ((Math.sqrt(Math.pow((first-third),2)+(Math.pow((second-fourth),2))))>= (Math.sqrt(Math.pow((first2-third2),2)+(Math.pow((second2-fourth2),2))))) {

            if ((Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2)))<= (Math.sqrt(Math.pow(third, 2) + Math.pow(fourth, 2)))) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",first,second,third,fourth);

            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",third,fourth,first,second);
        }
    } else {
            first = first2;
            second = second2;
            third  = third2;
            fourth = fourth2;

            if ((Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2)))<= (Math.sqrt(Math.pow(third, 2) + Math.pow(fourth, 2)))) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",first,second,third,fourth);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",third,fourth,first,second);
            }
        }

        return first;

    }
}

