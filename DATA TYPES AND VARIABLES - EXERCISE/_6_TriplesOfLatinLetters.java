package JavaBasics.Exercise7;

import java.util.Scanner;

public class _6_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < (97+input); i++) {
            for (int j = 97; j < (97+input) ; j++) {
                for (int k = 97; k < (97+input); k++) {
                    System.out.print((char)i);
                    System.out.print((char)j);
                    System.out.print((char)k);
                    System.out.println();
                }
            }
        }

    }
}

