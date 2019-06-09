package Fundamentals._16_ListExersiceAdvanced.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> saveFirstQuality = new ArrayList<>();
        for (int i = 0; i < drumSet.size(); i++) {
            saveFirstQuality.add(drumSet.get(i));
        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Hit it again, Gabsy!")) {
                break;
            }
            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < drumSet.size(); i++) {

                if (drumSet.get(i) > hitPower) {
                    drumSet.set(i, (drumSet.get(i) - hitPower));


                } else {
                    if (money > ((saveFirstQuality.get(i) * 3))) {
                        money = money - (saveFirstQuality.get(i) * 3);

                        drumSet.set(i, saveFirstQuality.get(i));

                    } else {
                        drumSet.remove(i);
                        saveFirstQuality.remove(i);
                        i--;
                    }
                }
            }

        }
        drumSet.forEach(e -> System.out.print(e + " "));
        System.out.printf("%nGabsy has %.2flv.",money);

    }
}

