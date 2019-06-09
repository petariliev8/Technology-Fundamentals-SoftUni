package Fundamentals._16_ListExersiceAdvanced;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_BombNumbers {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        List<Double> listArr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int[] boombArr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int bomb = boombArr[0];
        int power = boombArr[1];
        int count = 0;

        for (int i = 0; i < listArr.size(); i++) {
            if (listArr.get(i) == bomb) {

                for (int j = 1; j <= power; j++) {
                    if ((i - j) >= 0) {
                        if (listArr.get(i - j) != bomb) {
                            listArr.set((i - j), 99.0);
                        } else {
                            i++;  //когато има 2ра бомба (да я прескочим на главния FOR)
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (int j = 1; j <= power; j++) {
                    if ((i + j) < listArr.size()) {
                        if (listArr.get(i + j) != bomb) {
                            listArr.set(i + j, 99.0);
                            count++;
                        } else {
                            i++;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i = i + count;

        }
        double sum = 0;
        for (int i = 0; i < listArr.size(); i++) {
            if (listArr.get(i) != 99.0 && listArr.get(i) != bomb) {
                sum += listArr.get(i);
            }
        }
        System.out.println(df.format(sum));

    }
}

