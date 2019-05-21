package Fundamentals._12_Functions;

import java.util.Scanner;

public class _2_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
double number = Double.parseDouble(sc.nextLine());
grade(number);

    }

    public static void grade(double number) {

        if (number>=2 && number<=2.99) {
            System.out.println("Fail");
        }else if (number>=3 && number<=3.49) {
            System.out.println("Poor");
        }else if (number>=3.5 && number<=4.49) {
            System.out.println("Good");
        }else if (number>=4.50 && number<=5.49) {
            System.out.println("Very good");
        }else if (number>=5.5 && number<=6) {
            System.out.println("Excellent");
        }

    }
}

