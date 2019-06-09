package Fundamentals._16_ListExersiceAdvanced.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int textLength = numbers.length;
        int eachSteps = textLength/2;


       int[] firstCar = new int[eachSteps];
       int[] secondCar = new int[eachSteps];

        for (int i = 0; i <eachSteps ; i++) {
            firstCar[i]=numbers[i];

        }
        for (int i = numbers.length-1,j=0; j <eachSteps ; i--,j++) {
            secondCar[j]=numbers[i];

        }
            double timeFirst = 0;
            double timeSecond = 0;

        for (int i = 0; i <eachSteps ; i++) {

            timeFirst += firstCar[i];

            if(firstCar[i]==0){
                timeFirst *=0.8;
            }
            timeSecond += secondCar[i];

            if(secondCar[i]==0){
                timeSecond *=0.8;
            }


        }

        if(timeFirst<=timeSecond){
            System.out.printf("The winner is left with total time: %.1f",timeFirst);
        }else {
            System.out.printf("The winner is right with total time: %.1f",timeSecond);
        }



    }
}

