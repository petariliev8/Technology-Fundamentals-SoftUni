package Fundamentals._28_Text_Regex_Exercise;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.toMap;

public class _10_Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] participants = sc.nextLine().split(", ");

        Map<String, Integer> race = new LinkedHashMap<>();

        while (true) {
            String infoRace = sc.nextLine();
            if (infoRace.equals("end of race")) {

                break;

            }
            String name = "";
            int time = 0;

            for (int i = 0; i < infoRace.length(); i++) {
                if (Character.isLetter(infoRace.charAt(i))) {
                    name += infoRace.charAt(i);
                }
                if (Character.isDigit(infoRace.charAt(i))) {
                    time += Character.getNumericValue(infoRace.charAt(i));

                }
            }

            for (int i = 0; i < participants.length; i++) {
                if (participants[i].equals(name)) {
                    race.putIfAbsent(name, 0);
                    race.put(name, race.get(name) + time);
                }
            }

        }
        Map<String, Integer> sorted = race
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

      int count =0;
            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                if (count==0) {
                    System.out.println("1st place: " + entry.getKey());
                    count++;
                }else if (count==1) {
                    System.out.println("2nd place: " + entry.getKey());
                    count++;
                }else  {
                    System.out.println("3rd place: " + entry.getKey());
                    break;
                }
            }

    }
}