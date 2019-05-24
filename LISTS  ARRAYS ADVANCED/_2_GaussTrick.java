package Fundamentals._15_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers.length % 2 == 0) {
                int first = list.get(i);
                int second = list.get(numbers.length - i-1);
                list.set(i, (first + second));
                list.remove(numbers.length - 1-i);
            } else {
                    if (i == list.size() - 1) {

                    } else {
                        int first = list.get(i);
                        int second = list.get(numbers.length - i-1);
                        list.set(i, (first + second));
                        list.remove(numbers.length - i-1);
                    }
                }

            }
        String formating = list.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println(formating);

    }
    }


