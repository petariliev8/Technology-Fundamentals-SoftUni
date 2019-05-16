package Fundamentals._28_Text_Regex_Exercise;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11_SoftUni_Bar_income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        double sum =0;
        String regex = "[\\S \\w]*%[\\d ]*(?<name>[A-Z][a-z]*)" +
                "%[\\S \\w]*<(?<product>[\\w]+)" +
                ">[\\S \\w]*\\|[A-Z a-z]*(?<quantity>[0-9]+)" +
                "\\|([\\WA-Za-z]*)(?<price>[\\d]+[\\.]?[\\d]*)\\$";

        while (!input.equals("end of shift")){

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){

                double qunatity = Double.parseDouble(matcher.group("quantity"));
                double priceOneItem = Double.parseDouble(matcher.group("price"));
                double priceProduct = qunatity*priceOneItem;
                sum += priceProduct;

                System.out.println(String.format("%s: %s - %.2f",matcher.group("name")
                        ,matcher.group("product"),priceProduct));
            }





            input = sc.nextLine();
        }
        System.out.println(String.format("Total income: %.2f",sum));
    }
}
