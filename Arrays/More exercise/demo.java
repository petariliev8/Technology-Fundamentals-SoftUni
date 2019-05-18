package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String noChars = input.replaceAll("!+","");
        String [] noZeros = noChars.split("0");
        int length = 0;
        String bestSeq ="";

        for (int i = 0; i < noZeros.length ; i++) {
            System.out.println(noZeros[i]);
            if (noZeros[i].length()>length){
                length=noZeros[i].length();
                bestSeq=noZeros[i];
            }
        }


        int index = noChars.indexOf(bestSeq);
        System.out.println(index);




        }
}

