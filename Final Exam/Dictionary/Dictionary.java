package Fundamentals.Final_Exam;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" \\| ");

        Map<String, List<String>> map = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            String[] wordDefinition = input[i].split(": ");
            if (!map.containsKey(wordDefinition[0])) {
                map.put(wordDefinition[0], new ArrayList<>());
                map.get(wordDefinition[0]).add(wordDefinition[1]);

            } else {
                map.get(wordDefinition[0]).add(wordDefinition[1]);
            }
        }
        String[] words = sc.nextLine().split(" \\| ");

        String lastCommand = sc.nextLine();
        switch (lastCommand) {
            case "List":
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    System.out.print(entry.getKey() + " ");
                }
                break;
            case "End":
                Arrays.sort(words);  //sort words[]

                for (int i = 0; i < words.length; i++) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        entry.getValue().sort(Comparator.comparingInt(String::length));
                    }

                    if (map.containsKey(words[i])) {
                        System.out.println(words[i]);
                        for (int i1 = map.get(words[i]).size() - 1; i1 >= 0; i1--) {

                            System.out.println(" -" + map.get(words[i]).get(i1));
                        }
                    }

                }

                break;
        }
    }
}
