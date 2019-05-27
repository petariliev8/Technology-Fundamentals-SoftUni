package JavaBasics.Exercise7;

import java.util.Scanner;

public class _4_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 0; i < numbers; i++) {
            char first = scanner.nextLine().charAt(0);

            sum+=(char)first;
        }
        System.out.println( "The sum equals: "+sum);
    }
}

