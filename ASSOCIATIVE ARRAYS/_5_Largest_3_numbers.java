package Fundamentals._20_Associative_Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class _5_Largest_3_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

            int count = 0;
        for (int i = 0; i < input.size() && count<3; i++) {
            System.out.print(input.get(i) + " ");
            count++;
        }
    }
}

