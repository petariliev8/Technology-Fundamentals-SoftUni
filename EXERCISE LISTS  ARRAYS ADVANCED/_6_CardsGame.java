package Fundamentals._16_ListExersiceAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _6_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        int sum = 0;

        while (true){


            if (firstPlayer.get(0).equals(secondPlayer.get(0))){
                firstPlayer.remove(0);
                secondPlayer.remove(0);


            } else if (firstPlayer.get(0)< secondPlayer.get(0)){
                secondPlayer.add(secondPlayer.get(0));
                secondPlayer.add(firstPlayer.get(0));

                firstPlayer.remove(0);
                secondPlayer.remove(0);


            } else if(firstPlayer.get(0)> secondPlayer.get(0)){
                firstPlayer.add(firstPlayer.get(0));
                firstPlayer.add(secondPlayer.get(0));

                secondPlayer.remove(0);
                firstPlayer.remove(0);


            }
            if (firstPlayer.isEmpty()){
                for (int i = 0; i <secondPlayer.size() ; i++) {
                    sum+= secondPlayer.get(i);
                }
                System.out.println("Second player wins! Sum: "+sum);
                break;
            } else if (secondPlayer.isEmpty()){
                for (int i = 0; i <firstPlayer.size() ; i++) {
                    sum+= firstPlayer.get(i);
                }
                System.out.println("First player wins! Sum: "+sum);
                break;
            }

        }
    }
}

