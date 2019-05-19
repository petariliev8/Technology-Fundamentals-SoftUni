package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loses = Integer.parseInt(scanner.nextLine());
        double headsetP = Double.parseDouble(scanner.nextLine());
        double mouseP = Double.parseDouble(scanner.nextLine());
        double keyboardP = Double.parseDouble(scanner.nextLine());
        double displayP = Double.parseDouble(scanner.nextLine());

        int countLoses = 0;
        int countHead = 0;
        int countMouse = 0;
        int countKey = 0;
        int countDispl = 0;


        double mHeat = 0;
        double mMouse = 0;
        double mKey = 0;
        double mDisplay = 0;

        for (int i = 1; i <=loses; i++) {
            if (i%2==0) {
                countHead++;
            }
            if (i%3==0) {
                countMouse++;
            }
            if (i%2==0 && i%3==0) {
                countKey++;

            if (countKey%2==0) {
                countDispl++;

            }
            }
        }

        mDisplay=displayP*countDispl;
        mHeat = headsetP*countHead;
        mKey = keyboardP*countKey;
        mMouse=mouseP*countMouse;

        System.out.printf("Rage expenses: %.2f lv.",(mDisplay+mHeat+mKey+mMouse));
        
    }
    
    
}

