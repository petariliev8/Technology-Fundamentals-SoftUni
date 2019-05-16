package Fundamentals._28_Text_Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_Valid_Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String []input = sc.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {

            String word = input[i];
            if (isItValid(word)){
                System.out.println(word);
            }

        }

    }
    private static boolean isItValid (String word){
        if(word.length()<3 ||
                word.length()>16){
            return false;
        }

            for (int i1 = 0; i1 < word.length(); i1++) {

                if (!Character.isLetterOrDigit(word.charAt(i1))){

                    if(word.charAt(i1) == '-' || word.charAt(i1) == '_' ){

                    }else {
                        return false;
                    }
                }

            }



            return  true;
    }
}
