package Fundamentals._6_DataTypeAndVariables;

        import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money =Double.parseDouble(scanner.nextLine());

        double pound = 1.31;

        System.out.printf("%.3f",money*pound);

    }
}

