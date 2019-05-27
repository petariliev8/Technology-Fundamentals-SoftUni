package JavaBasics.Exercise7;

import java.util.Scanner;

public class _7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int sum = 0;

        for (int i = 0; i < numLines; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            sum += water;
            if ( sum>capacity) {
                System.out.println("Insufficient capacity!");
                sum = sum-water;
            }

        }
        System.out.println(sum);


    }
}

