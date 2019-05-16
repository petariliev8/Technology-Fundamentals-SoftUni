package Fundamentals._28_Text_Regex_Exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class _5_Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        BigDecimal sum = new BigDecimal(BigInteger.ONE);

        BigDecimal  input = new BigDecimal(sc.nextLine());

        int myltiply = sc.nextInt();

        sum = input.multiply(BigDecimal.valueOf(myltiply));

        System.out.println(sum);


    }
}
