package Fundamentals._18_ObjectsClasses;

import java.util.*;
import java.util.stream.Collectors;

public class _1_Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputWords = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());


        Collections.shuffle(inputWords);
        for (int i = 0; i <inputWords.size() ; i++) {
            System.out.println(inputWords.get(i));
        }

    }
}

