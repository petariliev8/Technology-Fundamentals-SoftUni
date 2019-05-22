package Fundamentals._13_ExerciseMethods.MoreExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1_DateTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String answer = scanner.nextLine();
        method(type,answer);

    }
    public static   String method (String type,String answer1){
        DecimalFormat df = new DecimalFormat("#.###");
        switch (type) {
            case "int":
                int intAns = Integer.parseInt(answer1);
                intAns = intAns*2;
                answer1 = String.valueOf(intAns);
                System.out.println(answer1);
                break;
            case "real":
                double doAns = Double.parseDouble(answer1);
                doAns = (doAns*1.5);
                System.out.printf("%.2f",doAns);
                break;
            case "string":
                answer1 = "$"+answer1+"$";
                System.out.println(answer1);

                break;
        }
        return answer1;
    }
}

