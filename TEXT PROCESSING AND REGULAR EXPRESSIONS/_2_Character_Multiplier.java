package Fundamentals._28_Text_Regex_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _2_Character_Multiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> input = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());


        input.sort((first, second) -> Integer.compare(second.length(),
                first.length()));
    int sum = 0;


        for (int i = 0; i < input.get(1).length(); i++) {

            sum += input.get(1).charAt(i)*input.get(0).charAt(i);



        }
        for (int i = input.get(1).length(); i < input.get(0).length(); i++) {
            sum += input.get(0).charAt(i);
        }
        System.out.println(sum);


    }
}
