package Fundamentals._15_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListManipulationBasics80_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

     while (!command.equals("end")) {

         String [] commandToArray = command.split(" ");
         switch (commandToArray[0]) {
             case "Add":
            int numberNew = Integer.parseInt(commandToArray[1]);
            input.add(numberNew);

                 break;
             case "Remove":
                 int numberToRemove = Integer.parseInt(commandToArray[1]);

                 input.remove(numberToRemove);

                 break;
             case "RemoveAt":
                 int index = Integer.parseInt(commandToArray[1]);

                    input.remove(index);

                 break;
             case "Insert":
                 int value = Integer.parseInt(commandToArray[1]);
                 int indexx = Integer.parseInt(commandToArray[2]);
                     input.add(indexx, value);

                 break;

         }

         command = scanner.nextLine();



     }
    /* String formating = input.toString().replace("[","")
             .replace(",","")
             .replace("]","").trim();
        System.out.println(formating); */

        System.out.println(input.toString().replaceAll("[\\[\\],]",""));
    }
}

