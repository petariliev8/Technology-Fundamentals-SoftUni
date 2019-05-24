package Fundamentals._15_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _1_SumAdjecentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        String line = scanner.nextLine();

        double [] numbersInt = Arrays.stream(line.split(" ")).mapToDouble(Double::parseDouble).toArray();
        List<Double> numbers = new ArrayList<>() ;
        int count = numbersInt.length;

        for (int i = 0; i <numbersInt.length ; i++) {
            numbers.add(numbersInt[i]);
        }

        while (count>0) {
            for (int i = 0; i<numbers.size()-1; i++) {
                double first = numbers.get(i);
                double second = numbers.get(i + 1);

                if (first == second) {
                    double sum = first + second;
                    numbers.set(i, sum);
                    numbers.remove(i + 1);
                }
            }
            count--;
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(df.format(numbers.get(i))+" ");
        }
    }
}

