package Fundamentals._15_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> secondList =Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> result = new ArrayList<>();
        if (firstList.size()>secondList.size()){
            for (int i = 0 ; i < firstList.size(); i++) {
                if (i>=secondList.size()){
                    result.add(firstList.get(i));
                }else {
                    result.add(firstList.get(i));
                    result.add(secondList.get(i));
                }
            }
        } else {
            for (int i = 0 ; i < secondList.size(); i++) {
                if (i>=firstList.size()){
                    result.add(secondList.get(i));
                }else {
                    result.add(firstList.get(i));
                    result.add(secondList.get(i));
                }
            }
        }
        String formating = result.toString().replace("[","")
                .replace(",","")
                .replace("]","")
                .trim();
        System.out.println(formating);


    }
}

