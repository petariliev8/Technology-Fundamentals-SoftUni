package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int firstDay = startYield;
        int countDays = 0;
        int sumSpice = 0;

        while (startYield>=100) {
            sumSpice += startYield;
            sumSpice -=26;
            countDays++;
            startYield -=10;

        }
        if (firstDay< 100 ) {
            System.out.println(countDays);
            System.out.println(sumSpice);
        } else {
            sumSpice-=26;
            System.out.println(countDays);
            System.out.println(sumSpice);
        }




    }
}

