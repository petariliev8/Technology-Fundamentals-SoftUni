package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class _6_Winning_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []text = sc.nextLine().split(",\\s+");
        String symbol = "";

        Map<Character, Integer> leftSide = new TreeMap<>();
        Map<Character, Integer> rightSide = new TreeMap<>();



        for (int i = 0; i < text.length; i++) {
            if (text[i].length()== 20) {
                String left = text[i].substring(0, 10);
                String right = text[i].substring(10);


                int leftAt = 0;
                int leftDias = 0;
                int leftUp = 0;
                int leftDollar = 0;

                int rightAt = 0;
                int rightDias = 0;
                int rightUp = 0;
                int rightDollar = 0;


                for (int i1 = 0; i1 < left.length(); i1++) {
                    if (left.charAt(i1) == '@' ){
                        leftAt++;
                       leftSide.put('@',leftAt);
                    }else if (left.charAt(i1) == '$' ){
                        leftDollar++;
                        leftSide.put('$',leftDollar);
                    }else if (left.charAt(i1) == '^' ){
                        leftUp++;
                        leftSide.put('^',leftUp);
                    }else if (left.charAt(i1) == '#' ){
                        leftDias++;
                        leftSide.put('#',leftDias);
                    }

                        symbol = Character.toString(left.charAt(i1));

                }
                for (int i1 = 0; i1 < right.length(); i1++) {
                    if (right.charAt(i1) == '@' ){
                        rightAt++;
                        rightSide.put('@',rightAt);
                    }else if (right.charAt(i1) == '$' ){
                        rightDollar++;
                        rightSide.put('$',rightDollar);
                    }else if (right.charAt(i1) == '^' ){
                        rightUp++;
                        rightSide.put('^',rightUp);
                    }else if (right.charAt(i1) == '#' ){
                        rightDias++;
                        rightSide.put('#',rightDias);
                    }
                }
            int currentLeftCount = 0;
            int currentRightCount = 0;
            String leftChar = "";
            String rightChar = "";

                for (Map.Entry<Character, Integer> entry : leftSide.entrySet()) {
                    if(entry.getValue()>5 ){
                        currentLeftCount = entry.getValue();
                        leftChar = Character.toString(entry.getKey());

                    }
                }
                for (Map.Entry<Character, Integer> entry : rightSide.entrySet()) {
                    if(entry.getValue()>5 ){
                        currentRightCount = entry.getValue();
                        rightChar = Character.toString(entry.getKey());

                    }
                }

            char ss ='"';

                if (currentLeftCount  == currentRightCount) {
                    if (currentLeftCount < 6) {

                        System.out.println("ticket " + ss + text[i] + ss + " - no match");

                    } else if (currentLeftCount < 10) {
                        System.out.println("ticket " + ss + text[i] + ss + " - " + currentLeftCount + leftChar);
                    } else {
                        System.out.println("ticket " + ss + text[i] + ss + " - " + currentLeftCount + leftChar + " Jakpot!");
                    }


                } else {
                    System.out.println("ticket " + ss + text[i] + ss + " - no match");
                }

            }else{
                System.out.println("Invalid ticket");
        }
        }
    }
}
