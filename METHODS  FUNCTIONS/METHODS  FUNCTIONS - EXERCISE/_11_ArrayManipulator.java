package Fundamentals._13_ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class _11_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e)).toArray();
        String metod = scanner.nextLine();
        while  (!metod.equals("end")) {

            String[] metodArr = metod.split(" ");
            if (metodArr[0].equals("exchange")){
                int move = Integer.parseInt(metodArr[1]);
                exchange(input,move);
            }else if (metodArr[0].equals("max")){

                maxOddEven(metodArr,input);

            }else if (metodArr[0].equals("min")){
                minOddEven(metodArr,input);
            }else if (metodArr[0].equals("first")){
                first(metodArr,input);
            }else if (metodArr[0].equals("last")) {
                last(metodArr,input);
            }

            metod = scanner.nextLine();
        }
        int count =0;
        System.out.print("[");
        for (int i = 0; i < input.length; i++) {
            if (count==0){
                System.out.print(input[i]);
                count++;
            }else {
                System.out.print(", "+input[i]);
            }
        }
        System.out.print("]");
    }
    public static int [] exchange (int [] input, int move) {
        if (move<input.length && move>=0) {

            int [] newOne = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                if (move+i+1<input.length) {
                    newOne[i] = input[move+i+1];

                }else {
                    newOne[i] = input[Math.abs(input.length-(move+1+i))];

                }

            }
            for (int i = 0; i <input.length ; i++) {
                input[i]=newOne[i];
            }

        }else {
            System.out.println("Invalid index");
        }

        return input;
    }

    public static int  maxOddEven (String [] metodArr,int [] input) {
        int index = 0;
        long maxOdd = Long.MIN_VALUE;
        long maxEven = Long.MIN_VALUE;
        if (metodArr[1].equals("even")){

            for (int i = 0; i <input.length ; i++) {
                if (input[i]%2==0 ){
                    if (input[i]>=maxEven ){
                        maxEven=input[i];
                        index = i;
                    }
                }
            }
            if ((maxEven==Long.MIN_VALUE)) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        } else {

            for (int i = 0; i <input.length ; i++) {
                if (input[i]%2!=0){
                    if (input[i]>=maxOdd){
                        maxOdd=input[i];
                        index = i;
                    }
                }
            }
            if ((maxOdd==Long.MIN_VALUE)) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        }


        return  index ;
    }

    public static int  minOddEven (String [] metodArr,int [] input) {
        int index = 0;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        if (metodArr[1].equals("even")){

            for (int i = 0; i <input.length ; i++) {
                if (input[i]%2==0){
                    if (input[i]<=minEven){
                        minEven=input[i];
                        index = i;
                    }
                }
            }
            if ((minEven==Integer.MAX_VALUE)) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        } else {

            for (int i = 0; i <input.length ; i++) {
                if (input[i]%2!=0){
                    if (input[i]<=minOdd){
                        minOdd=input[i];
                        index = i;
                    }
                }
            }
            if ((minOdd==Integer.MAX_VALUE)) {
                System.out.println("No matches");
            } else {
                System.out.println(index);
            }
        }


        return  index ;
    }

    public static int first (String [] metoArr,int [] input) {

        int index = Integer.parseInt(metoArr[1]);
        int even = 0;
        int odd = 0;
        if (metoArr[2].equals("even")) {
            if (index>input.length || index<=0) {
                System.out.println("Invalid count");
            } else {
                System.out.print("[");
                int count = 0;
                for (int i = 0; count<index && i < input.length; i++) {
                    if (input[i] % 2 == 0) {
                        if (count==0) {
                            System.out.print(input[i]);
                            count++;
                        } else {
                            System.out.print(", "+input[i]);
                            count++;
                        }

                    }
                }
                System.out.println("]");


            }

        }else if (metoArr[2].equals("odd")) {
            if (index>input.length || index<=0) {
                System.out.println("Invalid count");
            } else {
                int count =0;
                System.out.print("[");
                for (int i = 0; count<index && i < input.length; i++) {
                    if (input[i] % 2 != 0) {
                        if (count==0) {
                            System.out.print(input[i]);
                            count++;
                        } else {
                            System.out.print(", "+input[i]);
                            count++;
                        }

                    }
                }
                System.out.println("]");


            }

        }
        return index;
    }

    public static int last (String [] metoArr,int [] input) {

        int index = Integer.parseInt(metoArr[1]);

        if (metoArr[2].equals("even")) {
            if (index>input.length || index<=0) {
                System.out.println("Invalid count");
            } else {

                int k = index;
                int [] digitOfEven = new int [index];
                for (int i = 0; i < digitOfEven.length; i++) {
                    digitOfEven[i]=1;
                }

                for (int i =input.length-1 ;  i >=0 ; i--) {
                    if (input[i] % 2 == 0) {

                           digitOfEven[k-1]=input[i];
                           k--;
                                if (k<=0){
                                    break;
                                }
                    }
                }
                int countEven=0;
                System.out.print("[");
                for (int i = 0; i < digitOfEven.length; i++) {

                    if (digitOfEven[i]%2==0){
                        if(countEven==0){
                            System.out.print(digitOfEven[i]);
                            countEven++;
                        } else {
                            System.out.print(", "+digitOfEven[i]);
                        }
                    }
                }
                System.out.println("]");
            }

        } else if (metoArr[2].equals("odd")) {
            if (index>input.length || index<=0) {
                System.out.println("Invalid count");
            } else {
                int k = index;
                int [] digitOfodd = new int [index];
                for (int i = 0; i < digitOfodd.length; i++) {
                    digitOfodd[i]=2;
                }


                for (int i =input.length-1 ;  i >=0 ; i--) {
                    if (input[i] % 2 != 0) {

                        digitOfodd[k-1]=input[i];
                        k--;
                        if (k<=0){
                            break;
                        }
                    }
                }
                int countEven=0;
                System.out.print("[");
                for (int i = 0; i < digitOfodd.length; i++) {

                    if (digitOfodd[i]%2!=0){
                        if(countEven==0){
                            System.out.print(digitOfodd[i]);
                            countEven++;
                        } else {
                            System.out.print(", "+digitOfodd[i]);
                        }
                    }
                }
                System.out.println("]");
            }
        }
        return index;
    }
}

