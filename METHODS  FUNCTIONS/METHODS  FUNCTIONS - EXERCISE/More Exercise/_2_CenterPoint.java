package Fundamentals._13_ExerciseMethods.MoreExercise;

import java.util.Scanner;

public class _2_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        answer(x1, y1, x2, y2);



    }
    public static int answer (int x1, int y1, int x2, int y2) {

        if ((Math.abs(x1)+Math.abs(y1))<= (Math.abs(x2)+Math.abs(y2))) {
            x1 = x1;
            y1 = y1;
        } else {
            x1 = x2;
            y1 = y2;
        }

        System.out.println("("+x1+", "+y1+")");
        return x1+y1;
    }
}

