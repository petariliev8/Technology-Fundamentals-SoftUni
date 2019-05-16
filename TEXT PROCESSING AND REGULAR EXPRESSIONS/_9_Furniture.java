package Fundamentals._28_Text_Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _9_Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "(>>(?<name>[A-Za-z]+)<<(?<price>[\\d]+[\\.]?[\\d]*)!(?<quantity>[\\d]+))";
        //String regex = "^>+(?<name>[A-Z{0,}a-z]+)+<<(?<price>[\\d]+[\\.]?[\\d]+)+!(?<quantity>[\\d+]+)\\b";
        //String regex = ">>(?<name>[A-Za-z\\s]+)<<(?<price>\\d+(.\\d+)?)!(?<quantity>\\d+)";
        double sum = 0;

            System.out.println("Bought furniture:");

        while (true){
            String input = sc.nextLine();
            if(input.equals("Purchase")){
                break;
            }
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){

                System.out.println(matcher.group("name"));
                sum += Double.parseDouble(matcher.group("price"))*
                        Double.parseDouble(matcher.group("quantity"));
            }
        }
        System.out.println(String.format("Total money spend: %.2f",sum));
    }
}
