package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _3_Treasure_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = "";

        int[] key = Arrays.stream(sc.nextLine().
                split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while (true){
            String text = sc.nextLine();
            if(text.equals("find")){
                break;
            }
            for (int i = 0, j = 0; i < text.length(); i++, j++) {

                if(j == key.length){
                    j = 0;
                }
                message += (char)(text.charAt(i) - key[j]);


            }

            String regexType = "&(?<type>[\\w\\W]+)&";
            Pattern pattern = Pattern.compile(regexType);
            Matcher matcher = pattern.matcher(message);

            String regexCoordinates = "<(?<coordinates>[\\w\\W]+)>";
            Pattern patternCoord = Pattern.compile(regexCoordinates);
            Matcher matcherCoord = patternCoord.matcher(message);

            if(matcher.find() && matcherCoord.find()){
                System.out.println(String.format("Found %s at %s",matcher.group("type"),matcherCoord.group("coordinates")));
            }
            message="";

        }


    }
}
