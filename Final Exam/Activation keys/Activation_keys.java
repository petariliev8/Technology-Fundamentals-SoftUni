package Fundamentals.Final_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Activation_keys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("&");

        String regex16 = "^[\\w]{16}$";
        String regex25 = "^[\\w]{25}$";
        List<String> list16 = new ArrayList<>();
        List<String> list25 = new ArrayList<>();

        String word = "";
        int countComma = 0;

        for (int i = 0; i < input.length; i++) {
            Pattern pattern16 = Pattern.compile(regex16);
            Matcher matcher16 = pattern16.matcher(input[i]);
            if (matcher16.find()) {
                String key = input[i].toUpperCase();
                for (int i1 = 0; i1 < key.length(); i1++) {
                    if (Character.isDigit(key.charAt(i1))) {
                        int num = 9 - Character.getNumericValue(key.charAt(i1));
                        word += num;
                    } else {
                        word += key.charAt(i1);
                    }

                }
                if (countComma > 0) {
                    System.out.print(", ");
                }
                System.out.print(word.substring(0, 4) + "-");
                System.out.print(word.substring(4, 8) + "-");
                System.out.print(word.substring(8, 12) + "-");
                System.out.print(word.substring(12));
                countComma++;
                word = "";
            }
            Pattern pattern25 = Pattern.compile(regex25);
            Matcher matcher25 = pattern25.matcher(input[i]);
            if (matcher25.find()) {
                String key = input[i].toUpperCase();
                for (int i1 = 0; i1 < key.length(); i1++) {
                    if (Character.isDigit(key.charAt(i1))) {
                        int num = 9 - Character.getNumericValue(key.charAt(i1));
                        word += num;
                    } else {
                        word += key.charAt(i1);
                    }
                }
                if (countComma > 0) {
                    System.out.print(", ");
                }
                System.out.print(word.substring(0, 5) + "-");
                System.out.print(word.substring(5, 10) + "-");
                System.out.print(word.substring(10, 15) + "-");
                System.out.print(word.substring(15, 20) + "-");
                System.out.print(word.substring(20));
                countComma++;
                word = "";
            }
        }
    }
}
