package Fundamentals.Exam_Preparation.Exam_Mid_december_2018;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Santas_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> kidsList = Arrays.stream(sc.nextLine().split("&"))
                .collect(Collectors.toList());

        while (true){
            String input = sc.nextLine();
            if(input.equals("Finished!")){

                break;
            }
            String [] commands = input.split(" ");

            switch (commands[0]){
                case "Bad":
                    if(!kidsList.contains(commands[1])){
                        kidsList.add(0,commands[1]);
                    }
                    break;
                case "Good":
                    if(kidsList.contains(commands[1])){
                        kidsList.remove(commands[1]);
                    }
                    break;
                case "Rename":
                    if(kidsList.contains(commands[1])){
                        int index = kidsList.indexOf(commands[1]);
                        kidsList.remove(commands[1]);
                        kidsList.add(index,commands[2]);
                    }
                    break;
                case "Rearrange":
                    if(kidsList.contains(commands[1])){
                        kidsList.remove(commands[1]);
                        kidsList.add(commands[1]);
                    }
                    break;
            }






        }

        for (int i = 0; i < kidsList.size(); i++) {
            if(i == 0) {
                System.out.print(kidsList.get(i));
            }else{
                System.out.print(", "+kidsList.get(i));
            }

        }


    }
}
