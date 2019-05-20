package Fundamentals._6_DataTypeAndVariables;

        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(BigInteger.ONE);
        for (int i = 0; i < nums; i++) {
            BigDecimal  input = new BigDecimal(scanner.nextLine());

            sum = sum.add(input);

        }
        System.out.println((sum.subtract(BigDecimal.ONE)));
    }

}

