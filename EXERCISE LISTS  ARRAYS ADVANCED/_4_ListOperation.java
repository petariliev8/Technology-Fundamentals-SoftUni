package Fundamentals._16_ListExersiceAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Add":
                    arrayList.add(Integer.parseInt(command[1]));

                    break;
                case "Insert":
                    int indexInsert = Integer.parseInt(command[2]);
                    int number = Integer.parseInt(command[1]);

                    if (indexInsert > arrayList.size() || indexInsert < 0) {
                        System.out.println("Invalid index");

                    } else {
                        arrayList.add(indexInsert, number);
                    }

                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(command[1]);
                    if (indexRemove >= arrayList.size() || indexRemove < 0) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                        arrayList.remove(indexRemove);
                    }

                    break;
                case "Shift":
                    int indexShift = Integer.parseInt(command[2]);

                    if (command[1].equals("left")) {


                        for (int i = 0; i < indexShift; i++) {
                            arrayList.add(arrayList.get(0));
                            arrayList.remove(0);


                        }
                    } else if (command[1].equals("right")) {
                        for (int i = 0; i < indexShift; i++) {
                            arrayList.add(0, arrayList.get(arrayList.size() - 1));
                            arrayList.remove(arrayList.size() - 1);
                        }


                    }
                    break;


            }

            command = scanner.nextLine().split("\\s+");

        }
        arrayList.forEach(e -> System.out.print(e + " "));
    }
}

