package Fundamentals._18_ObjectsClasses;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class _2_SumBigNumbers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BigInteger first = scanner.nextBigInteger();
        BigInteger second = scanner.nextBigInteger();

        BigInteger sum = first.add(second);
        System.out.println(sum);


    }
}

