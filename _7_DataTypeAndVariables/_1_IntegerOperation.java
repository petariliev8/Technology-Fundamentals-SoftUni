package JavaBasics.Exercise7;

import java.util.Scanner;

public class _1_IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

    double sum  = (double)first + (double)second;
    double divide= sum/(double)third;
    double multyply = divide*(double)fourth;
        System.out.print((int)multyply);

    }
}

