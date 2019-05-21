package Fundamentals._12_Functions;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    int count = Integer.parseInt(sc.nextLine());


        System.out.println(repeatString(text,count));

    }

    static String repeatString(String text , int count) {
        String result = "";

        for (int i = 0; i <count ; i++) {
            result +=text;
        }
return result;
    }
}

