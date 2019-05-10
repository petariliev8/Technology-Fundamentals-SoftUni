package Fundamentals._9_Arrays;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = Integer.parseInt(scanner.nextLine());


        String daysOfWeeks[] = {

                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
            if ( numberOfDay>0 && numberOfDay<=7) {
                System.out.println(daysOfWeeks[numberOfDay-1]);
            } else {
                System.out.println("Invalid day!");
            }

    }
}

