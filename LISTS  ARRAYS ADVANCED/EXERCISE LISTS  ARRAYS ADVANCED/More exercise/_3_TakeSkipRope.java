package Fundamentals._16_ListExersiceAdvanced.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        String textString = "";
        String digitsString ="";

        for (int i = 0; i < inputText.length(); i++) {

            if (inputText.charAt(i) == '0' || inputText.charAt(i) == '1'
                    || inputText.charAt(i) == '2' || inputText.charAt(i) == '3'
                    || inputText.charAt(i) == '4' || inputText.charAt(i) == '5'
                    || inputText.charAt(i) == '6' || inputText.charAt(i) == '7'
                    || inputText.charAt(i) == '8' || inputText.charAt(i) == '9') {

                digitsString += inputText.charAt(i);

            } else {
                textString +=  inputText.charAt(i);

            }
        }


            List<String> textList = Arrays.stream(textString.split(""))
                    .collect(Collectors.toList());

            List<Integer>digitsList =Arrays.stream(digitsString.split("")).map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> takeList = new ArrayList<>();
            List<Integer> skipList = new ArrayList<>();

            for (int j = 0; j <digitsList.size() ; j++) {
                if(j%2==0){
                    takeList.add(digitsList.get(j));
                }else {
                    skipList.add(digitsList.get(j));
                }
            }

        String finalResult = "";
            for (int j = 0; j <takeList.size() ; j++) {


                for (int k = 0; k <takeList.get(j)&& textList.size()>0 ; k++) {
                    finalResult+=textList.get(0);
                  textList.remove(0);

                }

                for (int k = 0; k < skipList.get(j)&& textList.size()>0; k++) {
                    textList.remove(0);

                }

            }
            System.out.println(finalResult);


    }
}

