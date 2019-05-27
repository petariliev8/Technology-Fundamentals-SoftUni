package JavaBasics.Exercise7;

import java.util.Scanner;

public class _8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kind = Integer.parseInt(scanner.nextLine());

        double volume = 0;
        String numberOfKeg = "";
        double max = -Double.MAX_VALUE;
        for (int i = 1; i <=kind ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            volume = Math.PI*(Math.pow(radius,2)*height);

            if (volume>=max) {
                max=volume;
                numberOfKeg = model;

            }
        }
        System.out.println(numberOfKeg);

    }
}

