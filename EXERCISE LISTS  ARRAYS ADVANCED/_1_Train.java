package Fundamentals._16_ListExersiceAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacityWagon = Integer.parseInt(scanner.nextLine());

        String [] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){

            if (command[0].equals("Add")){
                wagons.add(Integer.parseInt(command[1]));

            }else {
                int morePeople = Integer.parseInt(command[0]);
                for (int i = 0; i<wagons.size() ;i++ ) {

                    if ((wagons.get(i)+morePeople)<=capacityWagon){
                        wagons.set(i,(wagons.get(i)+morePeople));
                        break;
                    }

                }


            }




            command = scanner.nextLine().split(" ");

        }
        String formating = wagons.toString().replaceAll("[\\[\\],]", "");
        System.out.println(formating);
    }
}

