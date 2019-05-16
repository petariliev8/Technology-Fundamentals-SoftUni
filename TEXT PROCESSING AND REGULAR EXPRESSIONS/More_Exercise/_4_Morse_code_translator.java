package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

import java.util.Scanner;

public class _4_Morse_code_translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");
        String text = "";

        for (int i = 0; i < input.length; i++) {

            if (input[i].equals(".-")) {
                text += "A";
            } else if (input[i].equals("-...")) {
                text += "B";
            } else if (input[i].equals("-.-.")) {
                text += "C";
            } else if (input[i].equals("-..")) {
                text += "D";
            } else if (input[i].equals(".")) {
                text += "E";
            } else if (input[i].equals("..-.")) {
                text += "F";
            } else if (input[i].equals("--.")) {
                text += "G";
            } else if (input[i].equals("....")) {
                text += "H";
            } else if (input[i].equals("..")) {
                text += "I";
            } else if (input[i].equals(".---")) {
                text += "J";
            } else if (input[i].equals("-.-")) {
                text += "K";
            } else if (input[i].equals(".-..")) {
                text += "L";
            } else if (input[i].equals("--")) {
                text += "M";
            } else if (input[i].equals("-.")) {
                text += "N";
            } else if (input[i].equals("---")) {
                text += "O";
            } else if (input[i].equals(".--.")) {
                text += "P";
            } else if (input[i].equals("--.-")) {
                text += "Q";
            } else if (input[i].equals(".-.")) {
                text += "R";
            } else if (input[i].equals("...")) {
                text += "S";
            } else if (input[i].equals("-")) {
                text += "T";
            } else if (input[i].equals("..-")) {
                text += "U";
            } else if (input[i].equals("...-")) {
                text += "V";
            }else if (input[i].equals(".--")) {
                text += "W";
            } else if (input[i].equals("-..-")) {
                text += "X";
            } else if (input[i].equals("-.--")) {
                text += "Y";
            } else if (input[i].equals("--..")) {
                text += "Z";
            } else if (input[i].equals("|")) {
                text += " ";
            }



        }
        System.out.println(text);
    }
}
