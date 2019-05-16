package Fundamentals._28_Text_Regex_Exercise;

import java.util.Scanner;

public class _6_Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder strBuilder = new StringBuilder(sc.nextLine());


        for (int i = 0,j=1; i < strBuilder.length()-1; i++,j++) {

            char start = strBuilder.charAt(i);

            char end = strBuilder.charAt(j);

            if (start==end){
                strBuilder.deleteCharAt(i);
                i--;j--;

            }


        }

        System.out.println(strBuilder);
    }
}
