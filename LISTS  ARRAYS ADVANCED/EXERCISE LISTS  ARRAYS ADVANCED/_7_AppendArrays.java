package Fundamentals._16_ListExersiceAdvanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _7_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();


        List<String> result = Arrays.stream(first.split("\\|")).collect(Collectors.toList());

        Collections.reverse(result);

        String forPrint = result.toString().replaceAll("[\\]\\[,]", "");

        forPrint = forPrint.replaceAll("\\s+", " ");
        System.out.println(forPrint);


    }
}
