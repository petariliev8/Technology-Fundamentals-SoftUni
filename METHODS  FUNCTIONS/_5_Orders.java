package Fundamentals._12_Functions;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        String product = num.nextLine();
        int pieces = Integer.parseInt(num.nextLine());
        double price = 0;

        switch (product) {
            case "coffee":
                price=1.5;
                System.out.printf("%.2f",result(price,pieces));
                break;
            case "water":
                price=1;
                System.out.printf("%.2f",result(price, pieces));
                break;
            case "coke":
                price=1.4;
                System.out.printf("%.2f",result(price, pieces));
                break;
            case "snacks":
                price=2;
                System.out.printf("%.2f",result(price, pieces));
                break;
        }

    }
    public static double result(double price,int pieces) {

        return price * pieces;

    }
}

