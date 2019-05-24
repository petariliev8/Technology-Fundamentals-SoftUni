package Fundamentals._15_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_ListManipulationAdvancedBOOM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandAtArray = command.split(" ");

            switch (commandAtArray[0]) {
                case "Contains":
                    boolean isItExist = input.contains(Integer.parseInt(commandAtArray[1]));
                    if (isItExist == true) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandAtArray[1].equals("even")) {
                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i) % 2 == 0) {
                                System.out.print(input.get(i) + " ");
                            }
                        }
                        System.out.println();
                        break;
                    } else {
                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i) % 2 != 0) {
                                System.out.print(input.get(i) + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }
                case "Get":
                    for (int i = 0; i < input.size(); i++) {
                        sum += input.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(commandAtArray[2]);
                    if (commandAtArray[1].equals("<")) {
                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i) < number) {
                                System.out.print(input.get(i) + " ");
                            }
                        }
                        System.out.println();

                    } else if (commandAtArray[1].equals("<=")) {

                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i) <= number) {
                                System.out.print(input.get(i) + " ");
                            }
                        }
                        System.out.println();

                    } else if (commandAtArray[1].equals(">")) {
                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i) > number) {
                                System.out.print(input.get(i) + " ");
                            }
                        }
                        System.out.println();


                    } else if (commandAtArray[1].equals(">=")) {
                        for (int i = 0; i < input.size(); i++) {
                            if (input.get(i) >= number) {
                                System.out.print(input.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }


                    break;
            }

            command = scanner.nextLine();
        }
    }
}

