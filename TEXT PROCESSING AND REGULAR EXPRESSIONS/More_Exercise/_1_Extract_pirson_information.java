package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_Extract_pirson_information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String regex = "@(?<name>[\\w\\W]+)\\|";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            String regexAge = "#(?<age>[\\w\\W]+)\\*";

            Pattern patternAge = Pattern.compile(regexAge);
            Matcher matcherAge = patternAge.matcher(input);

            if (matcherAge.find() && matcher.find()){
                name = matcher.group("name");
                age = Integer.parseInt(matcherAge.group("age"));
                System.out.println(name+" is "+
                        age+ " years old.");
            }


            age=0;
            name ="";
        }
    }
}
