package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double singleSabre = Double.parseDouble(scanner.nextLine());
        double singleRobe = Double.parseDouble(scanner.nextLine());
        double singleBelt = Double.parseDouble(scanner.nextLine());

        double allSabre =(singleSabre*Math.ceil(students*1.1));
        double allRobe =singleRobe*students;
        int beltDiscound = students/6;
        double allBelt =(singleBelt*(students-beltDiscound));
        double equipment = allBelt+allRobe+allSabre;
        if (money>=equipment) {
            System.out.printf("The money is enough - it would cost %.2flv.",(equipment));

        } else {
            System.out.printf("Ivan Cho will need %.2flv more.",(equipment-money));
        }



    }
}

