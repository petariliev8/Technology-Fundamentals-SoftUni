package Fundamentals._15_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _7_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <numbers.size() ; i++) {
            if (0>numbers.get(i)){
                numbers.remove(i);
                i--;
            }

        }
        Collections.reverse(numbers);
        if (numbers.size()==0) {
            System.out.println("empty");
        }else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

        }
    }
}

