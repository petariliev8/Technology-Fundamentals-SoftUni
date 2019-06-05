package Fundamentals._18_ObjectsClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputWords = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());

        Random random  = new Random();


        while (!inputWords.isEmpty()){
            int randomIndex = random.nextInt(inputWords.size());
            String randomString = inputWords.remove(randomIndex);
            System.out.println(randomString);

        }
    }
}

