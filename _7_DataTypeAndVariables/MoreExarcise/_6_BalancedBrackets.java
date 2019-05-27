package JavaBasics.Exercise7.MoreExarcise;

import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.nextLine());
        int countOpen = 0;
        int countClose = 0;

while (numLines>0) {
    String input = scanner.nextLine();
    int length = input.length();
        for (int i = 0; i <length ; i++) {


            char a = input.charAt(i);

            if (a == 40) {
                countOpen++;

            } else if (a == 41) {

                countClose++;
              if (countClose>countOpen) {
                  countClose+=7;
              }
            }
        }
numLines--;
        }
        if (countOpen == countClose) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }


    }
}

