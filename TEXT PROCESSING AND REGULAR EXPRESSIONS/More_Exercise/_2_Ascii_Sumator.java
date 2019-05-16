package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

import java.util.Scanner;

public class _2_Ascii_Sumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Character.valueOf(sc.nextLine().charAt(0));
        int second = Character.valueOf(sc.nextLine().charAt(0));

        int sum = 0;

        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            int currentSymbol = Character.valueOf(text.charAt(i));

            if(Math.min(first, second) < currentSymbol
            &&  Math.max(first, second) > currentSymbol){
                sum += currentSymbol;
            }
        }
        System.out.println(sum);

    }
}
