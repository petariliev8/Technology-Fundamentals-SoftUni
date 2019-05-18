package Fundamentals._10_Exercise_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class _10_LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeField = Integer.parseInt(sc.nextLine());
        int[] existLadybugs = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        String input = sc.nextLine();
        int[] array = new int[sizeField];
        int currentPosition = 0;
        int toLand = 0;
        String direction = "";

        for (int i = 0; i < existLadybugs.length; i++) {
            if (existLadybugs[i] >= 0 && existLadybugs[i] < sizeField) {
                array[existLadybugs[i]] = 1;
            }
        }

        while (!input.equals("end")) {
            String[] directoryFly = input.split(" ");

            currentPosition = Integer.parseInt(directoryFly[0]);
            toLand = Integer.parseInt(directoryFly[2]);
            direction = directoryFly[1];

            if (currentPosition < sizeField && currentPosition >= 0 && array[currentPosition] != 0 && toLand !=0) {
                int firstLand = toLand;


                if (direction.equals("right") && currentPosition + toLand < array.length
                        && currentPosition + toLand >= 0) {
                    if (array[currentPosition + toLand] == 0) {
                        array[currentPosition + toLand] = array[currentPosition];

                        array[currentPosition] = 0;
                    } else {

                        while (array[currentPosition + toLand] != 0) {
                            if (toLand > 0) {

                                toLand += firstLand;
                            } else if (toLand < 0) {
                                toLand += firstLand;
                            }
                            if (currentPosition + toLand >= array.length || currentPosition + toLand < 0) {

                                array[currentPosition] = 0;
                                break;
                            }

                            if (currentPosition + toLand < array.length && currentPosition + toLand >= 0) {
                                array[currentPosition + toLand] = array[currentPosition];

                                array[currentPosition] = 0;
                                break;
                            }
                        }
                    }

                }
                if (direction.equals("left") && currentPosition - toLand < array.length
                        && currentPosition - toLand >= 0) {
                    if (array[currentPosition - toLand] == 0) {
                        array[currentPosition - toLand] = array[currentPosition];

                        array[currentPosition] = 0;
                    } else {

                        while (array[currentPosition - toLand] != 0) {
                            toLand += firstLand;

                            if (currentPosition - toLand >= array.length || currentPosition - toLand < 0) {

                                array[currentPosition] = 0;
                                break;
                            }

                            if (currentPosition - toLand < array.length && currentPosition - toLand >= 0) {
                                array[currentPosition - toLand] = array[currentPosition];

                                array[currentPosition] = 0;
                                break;
                            }

                        }
                    }

                    } else{
                        array[currentPosition] = 0;
                    }


                }
                input = sc.nextLine();
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }


        }

    }
