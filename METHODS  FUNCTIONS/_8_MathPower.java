package Fundamentals._12_Functions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_MathPower {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");
            double first = Double.parseDouble(sc.nextLine());
            int second = Integer.parseInt(sc.nextLine());

            double result = pow(first,second);
        System.out.println(df.format(result));


    }

    static double pow(double first,int second) {

        double result = 1;

        for (int i = 0; i <second ; i++) {
            result*=first;
        }
        return result;
    }



}

