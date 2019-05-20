package Fundamentals._6_DataTypeAndVariables;

import java.util.Scanner;

public class ContactName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.print(firstName);
        System.out.print(delimeter);
        System.out.print(secondName);

    }
}

