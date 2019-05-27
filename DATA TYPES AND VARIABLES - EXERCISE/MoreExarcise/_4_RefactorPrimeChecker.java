package JavaBasics.Exercise7.MoreExarcise;

import java.util.Scanner;

public class RefactorPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= input; num++) {
            boolean primeNum = true;
            for (int divideNum = 2; divideNum < num; divideNum++) {
                if (num % divideNum == 0) {
                    primeNum = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, primeNum);
        }

    }
}

