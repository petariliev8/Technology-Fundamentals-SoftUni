package Fundamentals._4_EcerciseBasic.MoreExarcise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int max = 0;



        if ((num1 > num2) && (num1 > num3)) {
            if (num2 >= num3) {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if ((num2 > num1) && (num2 > num3)) {
            if (num1 >= num3) {
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
        } else if ((num3 > num2) && (num3 > num1)) {
            if (num2 >= num1) {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }
        } else if (num1>num2 && num1==num3) {
    

            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }else if (num2>num1 && num2==num3) {


            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        }else if (num3>num2 && num1==num3) {


            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else if (num2>num3 && num2==num1) {


            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
    }

}