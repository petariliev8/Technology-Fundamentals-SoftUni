package Fundamentals.Exam_Preparation.Exam_Mid_december_2018;

import java.util.Scanner;

public class Christmas_Spirit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int spirit = 0;

        int ornamment = 2;
        int treeSkirt = 5;
        int treeGarlands = 3;
        int treeLights = 15;

        for (int i = 1; i <= days; i++) {
            if (i % 11 == 0)
            {
                quantity += 2;
            }

            if(i % 3 == 0 && i % 5 == 0){
                spirit += 30;
            }
            if (i % 2 ==0){
                sum += quantity*ornamment;
                spirit += 5;
            }
            if (i % 3 == 0){
                sum +=  quantity*(treeGarlands + treeSkirt) ;
                spirit += 13;
            }
            if (i % 5 == 0){
                sum += quantity*treeLights ;
                spirit += 17;
            }

            if(i % 10 == 0){
                spirit -= 20;
                sum += treeGarlands+treeLights+treeSkirt;
            }


        }
        if(days % 10 == 0){
            spirit -= 30;
        }

        System.out.println("Total cost: "+sum);
        System.out.println("Total spirit: "+spirit);


    }
}
