package Fundamentals._10_Exercise_ARRAYS;

import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagons = Integer.parseInt(sc.nextLine());
        int sumPeople = 0;
        int [] peopleWagon = new int[wagons];

        for (int i = 0; i < wagons; i++) {
            peopleWagon [i] = Integer.parseInt(sc.nextLine());
            sumPeople+=peopleWagon[i];
        }
        for (int i = 0; i <wagons ; i++) {
            System.out.print(peopleWagon[i]+" ");
        }
        System.out.println();
        System.out.print(sumPeople);

    }
}

