package JavaBasics.Exercise7;

import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); // N
        int distance = Integer.parseInt(scanner.nextLine()); // M
        int factor = Integer.parseInt(scanner.nextLine());  // Y
        int Npower = power;  // Y
        int count = 0;

        while (power>=distance) {
            power-=distance;
            count++;


            if ((double)power == ((double)(Npower / 2))) {
                if (factor!=0) {
                    power = power / factor;
                }

            }



        }

        System.out.println(power);
        System.out.println(count);

    }
}

