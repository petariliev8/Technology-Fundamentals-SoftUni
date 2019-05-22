package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _4_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        checkForValid(password);
    }

    public static void checkForValid(String check) {
        int countDigit = 0;
        int countSigns = 0;
        for (int i = 0; i < check.length(); i++) {
            if ((check.charAt(i) == '0') ||
                    (check.charAt(i) == '1') ||
                    (check.charAt(i) == '2') ||
                    (check.charAt(i) == '3') ||
                    (check.charAt(i) == '4') ||
                    (check.charAt(i) == '5') ||
                    (check.charAt(i) == '6') ||
                    (check.charAt(i) == '7') ||
                    (check.charAt(i) == '8') ||
                    (check.charAt(i) == '9')) {
                countDigit++;
            } else if (((int) check.charAt(i) >= 0 &&
                    (int) check.charAt(i) <= 47) ||
                    ((int) check.charAt(i) >= 58 &&
                            (int) check.charAt(i) <= 64) ||
                    ((int) check.charAt(i) >= 91 &&
                            (int) check.charAt(i) <= 96) ||
                    ((int) check.charAt(i) >= 123)) {
                countSigns++;
            }
        }
        if (check.length() < 6 || check.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (countSigns > 0) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (countDigit < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        if((check.length() >= 6 && check.length() <= 10)&&(countSigns < 1)&&(countDigit >= 2)){
            System.out.println("Password is valid");

    }


}
}

