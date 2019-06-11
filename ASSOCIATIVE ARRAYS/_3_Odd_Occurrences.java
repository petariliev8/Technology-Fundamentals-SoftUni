package Fundamentals._20_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _3_Odd_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] inputArray = input.toLowerCase().split(" ");

        Map<String,Integer> toMap = new LinkedHashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            if(toMap.containsKey(inputArray[i])) {
                toMap.put(inputArray[i],toMap.get(inputArray[i])+1);
            }else {
                toMap.put(inputArray[i],1);
            }
        }
        int count = 0;
        for ( String key : toMap.keySet() ) {
            if (toMap.get(key) % 2 !=0 && count==0){
                System.out.print( key);
                count++;
            }else if (toMap.get(key) % 2 !=0 && count!=0){
                System.out.print( ", "+key);
            }

        }

    }
}

