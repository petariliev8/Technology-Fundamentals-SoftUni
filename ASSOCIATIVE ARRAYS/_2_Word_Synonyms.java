package Fundamentals._20_Associative_Arrays;

        import java.util.*;

public class _2_Word_Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String,ArrayList<String>> dictionary = new LinkedHashMap<>();
        for (int i = 0; i <lines ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(synonym);

        }
        dictionary.forEach((key, value) -> System.out.println(key+" - "+value.toString().replace("[","").replace("]","")));
    }
}


