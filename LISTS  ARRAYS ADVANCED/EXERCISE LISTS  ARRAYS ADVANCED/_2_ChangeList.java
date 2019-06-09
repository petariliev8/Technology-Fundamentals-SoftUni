package Fundamentals._16_ListExersiceAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("end")) {
            if (command[0].equals("Delete")) {
                int element = Integer.parseInt(command[1]);

                for (int i = 0; i <numbers.size() ; i++) {
                    if (numbers.get(i)== element ) {
                        numbers.remove(i);
                    }
                }
            } else if (command[0].equals("Insert")) {
                int index = Integer.parseInt(command[2]);
                int newNumber = Integer.parseInt(command[1]);
                if (index < numbers.size() && index >= 0) {

                    numbers.add(index, newNumber);
                }
            }

            command = scanner.nextLine().split("\\s+");

        }
        String formating = numbers.toString().replaceAll("[\\[\\],]", "");
        System.out.println(formating);

    }
}

