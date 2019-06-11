package Fundamentals._20_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _4_Word_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length()%2==0).toArray(String[]::new);
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);
        }


    }
}

