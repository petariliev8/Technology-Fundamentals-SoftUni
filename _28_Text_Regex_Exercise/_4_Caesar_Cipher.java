package Fundamentals._28_Text_Regex_Exercise;

import java.util.Scanner;

public class _4_Caesar_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String text = "";

        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i);
            char letter =(char)(number+3);
            text += letter;


        }
        System.out.println(text);
    }
}
