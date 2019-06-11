package Fundamentals._20_Associative_Arrays;

import java.util.*;

public class _1_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double [] numbres = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
int count = 0;
        Map<Double,Integer> toMap = new TreeMap<>();
        for (int i = 0; i <numbres.length; i++) {

            if (toMap.containsKey(numbres[i])){
                int value = toMap.get(numbres[i]);
                value++;
                toMap.replace(numbres[i],value);
            }else {
                toMap.put(numbres[i],1);
            }
        }

        toMap.forEach((key, value) -> System.out.printf("%.0f -> %d%n",key,value));
    }
}

