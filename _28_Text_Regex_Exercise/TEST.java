package Fundamentals._28_Text_Regex_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEST {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String chars =  "text";
        String letter = Character.toString(chars.charAt(2));
        System.out.println(letter);
    }
}
