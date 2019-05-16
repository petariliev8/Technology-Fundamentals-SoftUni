package Fundamentals._28_Text_Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _8_Extract_emails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  input = sc.nextLine();

        String regex = "\\s+(?<print>[A-Za-z0-9][\\w-_.]*@[A-Za-z-]+(\\.[A-Za-z]+)+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group("print"));
        }
    }
}
