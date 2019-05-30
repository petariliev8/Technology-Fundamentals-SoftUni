package Fundamentals._16_ListExersiceAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _8_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputArr = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());

        List<String> mergeArr = new ArrayList<>();
        String sum ="";

        String [] mergeDivide = scanner.nextLine().split("\\s+");
        while (!mergeDivide[0].equals("3:1")){

            switch (mergeDivide[0]){
                case "merge":
                    int firstIndex = Integer.parseInt(mergeDivide[1]);
                    int lastIndex = Integer.parseInt(mergeDivide[2]);
                    if (firstIndex<inputArr.size() && lastIndex>0) {


                        if (firstIndex < 0) {
                            firstIndex = 0;
                        }
                        if (lastIndex > inputArr.size() - 1) {
                            lastIndex = inputArr.size() - 1;
                        }
                        mergeArr = new ArrayList<>();

                        for (int i = 0,j=0; i < inputArr.size(); i++) {
                            if(i>=firstIndex && i<=lastIndex){
                                sum += inputArr.get(i);
                            }else {
                                j++;
                                mergeArr.add(inputArr.get(i));

                            }
                        }
                        mergeArr.add(firstIndex,sum);
                    }
                    break;
                case "divide":
                    int firstIndDivide = Integer.parseInt(mergeDivide[1]);
                    int lastIndDivide= Integer.parseInt(mergeDivide[2]);

                    String toEqualLength = inputArr.get(firstIndDivide);
                    inputArr.remove(firstIndDivide);
                    String sumDivide = "";
                    if (toEqualLength.length()%lastIndDivide==0){
                        int divide = toEqualLength.length()/lastIndDivide;
                        for (int i = 0; i <lastIndDivide ; i++) {
                            for (int j = 0; j < divide; j++) {

                                sumDivide += toEqualLength.charAt(j);

                            }
                            toEqualLength = toEqualLength.substring(divide);
                            inputArr.add(firstIndDivide+i,sumDivide);
                            sumDivide="";
                        }


                    } else {
                        int divide = 1;
                        int count = 0;
                        for (int i = 0; i <lastIndDivide-1 ; i++) {
                            for (int j = 0; j < divide; j++) {

                                sumDivide += toEqualLength.charAt(j);
                                count++;

                            }
                            toEqualLength = toEqualLength.substring(divide);
                            inputArr.add(firstIndDivide+i,sumDivide);
                            sumDivide="";
                        }
                        inputArr.add(firstIndDivide+count,toEqualLength);
                    }
                    mergeArr = inputArr;
                    break;
            }
            if (!mergeArr.isEmpty() && inputArr!=mergeArr) {
                inputArr = mergeArr;
                sum = "";
            }

            mergeDivide = scanner.nextLine().split("\\s+");
        }
        String forPrint = inputArr.toString().replaceAll("[\\]\\[,]", "");

        inputArr.forEach(e -> System.out.print(e + " "));

    }
}

