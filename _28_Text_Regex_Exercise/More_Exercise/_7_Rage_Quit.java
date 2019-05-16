package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

        import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class _7_Rage_Quit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String regex = "[^\\d\\s]*(?<numb>[\\d]+)[^\\d\\s]*";
        String text = "";
        Map<Character,Integer> count = new HashMap<>();
        String upeerCase = input.toUpperCase();

        int countRegex = 0;
        String regexCount = "[^\\d]{1}";
        Pattern countPattern = Pattern.compile(regexCount);
        Matcher matcherCount = countPattern.matcher(upeerCase);
        while (matcherCount.find()){
            countRegex++;
        }
        List<Character> asd = new ArrayList<>();
        System.out.println(countRegex);
        for (int i = 0; i < upeerCase.length(); i++) {
            if(!Character.isDigit(upeerCase.charAt(i)) && !asd.contains(upeerCase.charAt(i))){
               // count.putIfAbsent(upeerCase.charAt(i),1);

            }

        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){

            int number= Integer.parseInt(matcher.group("numb"));
            String forIndex = String.valueOf(number);
            int index = input.indexOf(forIndex);

            for (int i = 0; i < number; i++) {
                text += input.substring(0,index);


            }
            input = input.substring(index+1);



        }


        String nas = text.toUpperCase();
        System.out.println("Unique symbols used: "+count.size());
        System.out.println(nas);
    }
}
