package Fundamentals._28_Text_Regex_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _14_Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split("\\s+");
        List<Double> allNumb = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String currentCase = input[i];

            double currentNumber = Double.parseDouble(currentCase.substring(1,currentCase.length()-1));

            if( Character.isLowerCase(currentCase.charAt(0))){
                int lowerFirstPosition = 0;
                for (int i1 = 97,j=1; i1 < 123; i1++,j++) {
                    if(i1 == currentCase.charAt(0)){
                        lowerFirstPosition = j;
                        break;
                    }
                    lowerFirstPosition++;
                }
                currentNumber = currentNumber*lowerFirstPosition;

            }else {
                int upperCount = 0;
                for (int i1 = 65,j=1; i1 < 91; i1++,j++) {
                    if(i1 == currentCase.charAt(0)){
                        upperCount = j;
                        break;
                    }
                    upperCount++;
                }
                currentNumber = currentNumber/upperCount;
            }
            if( Character.isLowerCase(currentCase.charAt(currentCase.length()-1))){
                int lowerFirstPosition = 0;
                for (int i1 = 97,j=1; i1 < 123; i1++,j++) {
                    if(i1 == currentCase.charAt((currentCase.length()-1))){
                        lowerFirstPosition = j;
                        break;
                    }
                    lowerFirstPosition++;
                }
                currentNumber = currentNumber+lowerFirstPosition;


            }else {
                int upperCount = 0;
                for (int i1 = 65,j=1; i1 < 91; i1++,j++) {
                    if(i1 == currentCase.charAt((currentCase.length()-1))){
                        upperCount = j;
                        break;
                    }
                    upperCount++;
                }
                currentNumber = currentNumber-upperCount;

            }


                allNumb.add(currentNumber);
        }

        double sum =0;
        for (int i = 0; i < allNumb.size(); i++) {
           sum+= allNumb.get(i);

        }
        System.out.println(String.format("%.2f",sum));
    }
}
