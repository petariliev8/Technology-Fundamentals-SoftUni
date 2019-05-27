package JavaBasics.Exercise7;

import java.util.Scanner;

public class _11_SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        double max = -Double .MAX_VALUE;
        int bigsnow = 0;
        int bigtima = 0;
        int bigquality = 0;
        double eachValue = 0;


        for (int i = 0; i < numbers; i++) {
            int snowBallsSnow = Integer.parseInt(scanner.nextLine());
            int snowBallsTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

             eachValue =Math.pow( snowBallsSnow/snowBallsTime,snowBallQuality);
                if (eachValue>max) {
                    max = eachValue;
                    bigquality = snowBallQuality;
                    bigsnow = snowBallsSnow;
                    bigtima = snowBallsTime;
                }

        }
        System.out.printf("%d : %d = %.0f (%d)",bigsnow,bigtima,max,bigquality);

    }
}

