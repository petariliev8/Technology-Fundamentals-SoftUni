package JavaBasics.Exercise7.MoreExarcise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        int space = 0;
        String sumFirstNum = "";
        String first = "";
        String second = "";
        String sumSecondNum = "";
        int counter1 = 0;
        int sumOfDifits = 0;
        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();
            int lengthString = input.length();

            for (int j = 0; j < lengthString; j++) {

                char SingleDigit = input.charAt(j);
                if (SingleDigit == 32) {
                    space = j;
                    counter1++;

                }
                if (counter1 == 0) {
                    first = "" + SingleDigit;
                    sumFirstNum += first;
                } else if (SingleDigit!=32){
                    second = "" + SingleDigit;
                    sumSecondNum += second;
                }
            }
            long leftNum = Long.parseLong(sumFirstNum);
            long rightNum = Long.parseLong(sumSecondNum);


            if (leftNum > rightNum) {
                int sumlength = sumFirstNum.length();
                 sumOfDifits = 0;
                for (int k = 0; k < sumlength; k++) {

                    long qw = leftNum % 10;
                    sumOfDifits += qw;
                    leftNum = leftNum / 10;
                }
                System.out.println(Math.abs(sumOfDifits));
            } else {

                int sumlength = sumSecondNum.length();
                 sumOfDifits = 0;
                for (int q = 0; q < sumlength+10; q++) {

                    long qw = rightNum % 10;
                    sumOfDifits += qw;
                    rightNum = rightNum / 10;
                }
                System.out.println(Math.abs(sumOfDifits));

            }
            space = 0;
            sumFirstNum = "";
            first = "";
            second = "";
            sumSecondNum = "";
            counter1 = 0;
            sumOfDifits = 0;
        }


    }
}

