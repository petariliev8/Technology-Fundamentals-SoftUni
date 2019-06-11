package Fundamentals._20_Associative_Arrays;

import java.util.*;

public class _2_WordsSynonyms_2_ListMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        String word = "";
        String synonyms = "";

        while (n != 0) {
            word = sc.nextLine();
            synonyms = sc.nextLine();

            if (wordSynonyms.containsKey(word)) {
                wordSynonyms.get(word).add(synonyms);
            } else {
                wordSynonyms.put(word, new ArrayList<>());
                wordSynonyms.get(word).add(synonyms);
            }

            n--;
        }

        //wordSynonyms.entrySet().iter
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (i < entry.getValue().size() - 1) {
                    System.out.print(entry.getValue().get(i) + ", ");
                } else {
                    System.out.print(entry.getValue().get(i));
                }
            }
            System.out.println();
        }
    }
}

