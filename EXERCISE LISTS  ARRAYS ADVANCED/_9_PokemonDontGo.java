package Fundamentals._16_ListExersiceAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine()
                .split("\\s+")) .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> toSaveIt = new ArrayList<>();

        int index = Integer.parseInt(scanner.nextLine());
        int sumOfRemoveElements =0;

        while (true) {
            if (input.size() > 1) {
                if (index >= 0 && index < input.size()) {
                    sumOfRemoveElements += input.get(index);
                    for (int i = 0; i < input.size(); i++) {


                        if (input.get(i) <= input.get(index) && i != index) {
                            toSaveIt.add(input.get(i) + input.get(index));

                        } else if (input.get(i) > input.get(index) && i != index) {
                            toSaveIt.add(input.get(i) - input.get(index));
                        }
                    }
                } else if (index < 0) {
                    sumOfRemoveElements += input.get(0);
                    int removeElement = input.get(0);
                    input.set(0, input.get(input.size() - 1));  //копиране на последния елемент върху първия!

                    for (int i = 0; i < input.size(); i++) {


                        if (input.get(i) <= removeElement) {
                            toSaveIt.add(i, input.get(i) + removeElement);

                        } else if (input.get(i) > removeElement) {
                            toSaveIt.add(i, input.get(i) - removeElement);
                        }

                    }


                } else if (index > input.size() - 1) {
                    sumOfRemoveElements += input.get(input.size() - 1);

                    int removeElement = input.get(input.size() - 1);
                    input.set(input.size() - 1, input.get(0));  //копиране на последния елемент върху първия!

                    for (int i = 0; i < input.size(); i++) {


                        if (input.get(i) <= removeElement) {
                            toSaveIt.add(i, input.get(i) + removeElement);

                        } else if (input.get(i) > removeElement) {
                            toSaveIt.add(i, input.get(i) - removeElement);
                        }

                    }
                }

                if (!input.isEmpty()) {
                    input = toSaveIt;
                    toSaveIt = new ArrayList<>();
                    index = Integer.parseInt(scanner.nextLine());

                }
                } else {
                    sumOfRemoveElements += input.get(0);
                    System.out.println(sumOfRemoveElements);
                    break;
                }

        }

    }
}

