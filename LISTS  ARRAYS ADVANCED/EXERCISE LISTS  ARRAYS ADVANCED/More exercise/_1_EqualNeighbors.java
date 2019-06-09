package Fundamentals._16_ListExersiceAdvanced.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_EqualNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

       String textList = scanner.nextLine();
        String forPrint = "";

        int countWhile = numbersList.size();
        int counti = 0;

        while (counti<countWhile){

            int elementLength = numbersList.get(counti);
         int length =  String.valueOf(elementLength).length();
         int sum = 0;
            for (int i = 0; i <length ; i++) {
                int digit = elementLength%10;
                sum+=digit;
                elementLength=elementLength/10;
            }


            if ( textList.length()<sum){
                while (textList.length()<sum){
                    sum=sum-(textList.length());

                }

            }

            forPrint +=textList.charAt(sum);
           textList = textList.substring(0,sum)+textList.substring(sum+1);

            counti++;
        }
        System.out.println(forPrint);
    }
}

