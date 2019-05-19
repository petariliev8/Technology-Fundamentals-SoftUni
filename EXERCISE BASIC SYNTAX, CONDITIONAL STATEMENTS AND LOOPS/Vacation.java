package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double moneyAccount = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        double spendSave = Double.parseDouble(scanner.nextLine());

        int countSpend = 0;
        int countDays = 1;
        endTheProgra:
        while (true){
            switch (command){
                case "save":
                    moneyAccount +=spendSave;

                    countSpend=0;
                    break;
                case "spend":
                    moneyAccount -=spendSave;
                    if(moneyAccount<0)
                        moneyAccount=0;
                    countSpend++;
                    break;


            }
            if (countSpend==5 ){
                System.out.println("You can't save the money.");
                System.out.println(countDays);
                break endTheProgra;
            }
            if (moneyAccount>=vacationPrice){
                System.out.println("You saved the money for "+countDays+" days.");
           break endTheProgra;
            }

             command = scanner.nextLine();
             spendSave = Double.parseDouble(scanner.nextLine());
             countDays++;

        }

    }
}

