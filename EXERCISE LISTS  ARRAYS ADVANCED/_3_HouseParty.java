package Fundamentals._16_ListExersiceAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _3_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command = Integer.parseInt(scanner.nextLine());

        List<String> listGuests = new ArrayList<>();

        String[] whoIsGoingOrNot = scanner.nextLine().split("\\s+");
        while (command > 0) {
            if (whoIsGoingOrNot[2].equals("going!")) {
                if (listGuests.contains(whoIsGoingOrNot[0]) != true) {
                    listGuests.add(whoIsGoingOrNot[0]);
                } else {
                    System.out.println(whoIsGoingOrNot[0] + " is already in the list!");
                }

            } else {

                if (listGuests.contains(whoIsGoingOrNot[0]) != true) {
                    System.out.println(whoIsGoingOrNot[0] + " is not in the list!");
                } else {
                 listGuests.remove(whoIsGoingOrNot[0]);
                }
            }
            command--;
            if (command>0){
                whoIsGoingOrNot = scanner.nextLine().split("\\s+");
            }
        }

        listGuests.forEach(e -> System.out.println(e + " "));
    }
}

