package Fundamentals._10_Exercise_ARRAYS.MoreExercise;

import java.util.Scanner;

public class _2_PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        int j = 0;
        int k = 0;
        int [] first = new int [k];

        for (int i = 0; i <=lines ; i++) {

            int [] second = new int [i];

                    for ( k = 0; k <second.length ; k++) {

                        if (second.length>2) {

                                second[0] = 1;
                                second[second.length - 1] = 1;
                                if (k>0 && k<(second.length - 1)) {

                                    second[k]=first[k-1]+first[k];

                                }
                        }else {
                            second[0] = 1;
                            second[second.length-1]=1;

                        }
                    }
            first = second;

            for (int l = 0; l <first.length ; l++) {
                System.out.print(first[l]+" ");
            }
            System.out.println();
            }












    }
}

