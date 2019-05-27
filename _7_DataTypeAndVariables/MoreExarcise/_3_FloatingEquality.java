package JavaBasics.Exercise7.MoreExarcise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input1 = Double.parseDouble(scanner.nextLine());
        double input2 = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        if (Math.abs(input1-input2)>eps) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}

