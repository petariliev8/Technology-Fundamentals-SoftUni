package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int firstNum = Integer.parseInt(sc.nextLine());
   int second = Integer.parseInt(sc.nextLine());
   int third = Integer.parseInt(sc.nextLine());

   printSmallestOfThreeNum(firstNum,second,third);
    }
    public static void printSmallestOfThreeNum (int i,int s,int t) {
            if (i<s && i<t) {
                System.out.println(i);
            } else if (s<i && s<t) {
                System.out.println(s);
            } else {
                System.out.println(t);
            }
    }
}

