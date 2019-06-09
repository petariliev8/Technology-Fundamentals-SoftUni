package Fundamentals._16_ListExersiceAdvanced.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _4_MizedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mixedList = new ArrayList<>();
        int firstLess = 0;
        int secondLess = 0;
        if (first.size()>second.size()){
            for (int i = 0; i <second.size() ; i++) {
                mixedList.add(first.get(i));
                mixedList.add(second.get(second.size()-1-i));

            }
            firstLess=first.get(first.size()-1);
            secondLess=first.get(first.size()-2);

        }else {
            for (int i = 0; i <first.size() ; i++) {
                mixedList.add(first.get(i));
                mixedList.add(second.get(second.size()-1-i));

            }
            firstLess=second.get(0);
            secondLess=second.get(1);

        }
List<Integer> finalResult = new ArrayList<>();
        if(firstLess>=secondLess){
            for (int i = 0; i <mixedList.size(); i++) {
                if (mixedList.get(i)<firstLess
                && mixedList.get(i)>secondLess){
                   finalResult.add( mixedList.get(i));
                }
            }


        }else {
            for (int i = 0; i <mixedList.size(); i++) {
                if (mixedList.get(i)<secondLess
                        && mixedList.get(i)>firstLess){
                    finalResult.add( mixedList.get(i));
                }
            }
        }

        Collections.sort(finalResult);
        finalResult.forEach(e -> System.out.print(e + " "));

    }
}

