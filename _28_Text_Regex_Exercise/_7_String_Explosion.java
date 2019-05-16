package Fundamentals._28_Text_Regex_Exercise;

import java.util.Scanner;

public class _7_String_Explosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder input = new StringBuilder(sc.nextLine());


        for (int i = input.length()-1; i >= 0; i--) {

            if (input.charAt(i)=='>'){
                int number = Character.getNumericValue(input.charAt(i+1));
                if(number+i>input.length()){
                    number = input.length()-i-1;
                }

                int count = i+1;
                for (int h = 0; h < number; h++) {
                    if(count>=input.length()){
                        break;
                    }

                    if (input.charAt(count) != '>'){

                        input.deleteCharAt(count);

                    }else{
                        count++;
                        h--;
                    }
                }
            }
        }
        System.out.println(input);
    }
}
