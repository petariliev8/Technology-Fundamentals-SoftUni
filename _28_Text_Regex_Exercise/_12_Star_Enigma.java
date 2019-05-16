package Fundamentals._28_Text_Regex_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12_Star_Enigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String regex = "(?:[^@\\-!:>]*)@(?<planet>[A-Za-z]+)(?:[^@\\-!:>]*):" +
                "(?<population>[\\d]+)(?:[^@\\-!:>]*)!(?<attack>[AD])!" +
                "(?:[^@\\-!:>]*)->(?<soldiers>[\\d]+)";
        int attackPlanet = 0;
        List<String> attackList = new ArrayList<>();
        int destroyedPlanet = 0;
        List<String> destroydList = new ArrayList<>();
        for (int i = 0; i < n; i++) {


            String input = sc.nextLine();

            int count = 0;
            String decryption = "";
            for (int k = 0; k < input.length(); k++) {

                if(input.charAt(k)=='S' ||
                        input.charAt(k)=='s' ||
                        input.charAt(k)=='T' ||
                        input.charAt(k)=='t' ||
                        input.charAt(k)=='A' ||
                        input.charAt(k)=='a' ||
                        input.charAt(k)=='R' ||
                        input.charAt(k)=='r' ){

                    count++;

                }

            }
            for (int i1 = 0; i1 < input.length(); i1++) {
                decryption += (char) (input.charAt(i1) - count);
            }

            Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(decryption);

            if (matcher.find()){

                if(matcher.group("attack").equals("A")
                || matcher.group("attack").equals("a")){
                    attackPlanet++;
                    attackList.add(matcher.group("planet"));
                }else {
                    destroyedPlanet++;
                    destroydList.add(matcher.group("planet"));
                }

            }




        }

        Collections.sort(attackList);
        Collections.sort(destroydList);
        if (attackPlanet != 0){
            System.out.println("Attacked planets: "+attackPlanet);
            for (String s : attackList) {
                System.out.println("-> "+s);
            }
        }else {
            System.out.println("Attacked planets: 0");
        }
        if (destroyedPlanet != 0){
            System.out.println("Destroyed planets: "+destroyedPlanet);
            for (String s : destroydList) {
                System.out.println("-> "+s);
            }
        }else {
            System.out.println("Destroyed planets: 0");
        }
    }
}
