package Fundamentals.Final_Exam;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Vapor_Winter_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> gameNameAndPrice = new HashMap<>();
        Map<String, Double> gameNameAndPriceWithDLC = new HashMap<>();

        String [] input = sc.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            if(input[i].contains(":")){
                String[] nameAndDLC = input[i].split(":");
                if(gameNameAndPrice.containsKey(nameAndDLC[0])) {
                    String game = nameAndDLC[0];
                    String dlc = nameAndDLC[1];
                    Double price = gameNameAndPrice.get(nameAndDLC[0]) * 1.2;
                    gameNameAndPriceWithDLC.putIfAbsent(game + " - " + dlc, price);
                    gameNameAndPrice.remove(nameAndDLC[0]);
                }
            }else{
                String[] nameAndPrice = input[i].split("-");
                String game = nameAndPrice[0];
                Double price = Double.parseDouble(nameAndPrice[1]);
                gameNameAndPrice.putIfAbsent(game, price);

            }
        }
        Map<String,Double> sorted = gameNameAndPriceWithDLC
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
        Map<String,Double> sorted2 = gameNameAndPrice
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        sorted.forEach((key, value) -> System.out.printf("%s - %.2f%n",key,value*0.5));
        sorted2.forEach((key, value) -> System.out.printf("%s - %.2f%n",key,value*0.8));
    }


}

