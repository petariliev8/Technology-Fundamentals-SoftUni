package Fundamentals._10_Exercise_ARRAYS.MoreExercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class _1_EncryptSortAndPrintArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lines = Integer.parseInt(sc.nextLine());
        Integer [] sums = new Integer[lines] ;
    int sum = 0;
    int bestSum = 0;


       for (int j = 0; j < lines; j++) {
       String name = sc.nextLine();

       String[] vowel = name.split("");

           for (int i = 0; i < vowel.length; i++) {
               int ascii = vowel[i].charAt(0);
               if (ascii == 97 || ascii == 65
                       || ascii == 101 || ascii == 69
                       || ascii == 105 || ascii == 73
                       || ascii == 111 || ascii == 79
                       || ascii == 117 || ascii == 85)
               {

                   ascii = ascii * vowel.length;
                   sum += ascii;

               } else {

                   ascii = ascii / vowel.length;
                   sum += ascii;


               }
           }

           sums[j]=sum;
           sum = 0;



   }
        Arrays.sort(sums);
        for (Integer i : sums) {
            System.out.println(i.intValue() );
        }

    }
}

