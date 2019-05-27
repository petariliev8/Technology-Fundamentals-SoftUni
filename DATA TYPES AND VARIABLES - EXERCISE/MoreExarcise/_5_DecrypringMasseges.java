package JavaBasics.Exercise7.MoreExarcise;

import java.util.Scanner;

public class DecrypringMasseges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String password = "";
        int  sum =0;

        for (int i = 0; i < lines; i++) {
            char letter = scanner.nextLine().charAt(0);

            boolean check = Character.isLowerCase(letter);

            if (check == true) {
                  sum  = letter+key;

            } else {
                  sum  = letter+key;

            }
           password +="" +(char)sum;   //събираме буквите за паролата
        }
        System.out.println(password);
    }
}

