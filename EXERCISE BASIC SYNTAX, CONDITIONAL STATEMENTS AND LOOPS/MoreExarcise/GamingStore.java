package Fundamentals._4_EcerciseBasic.MoreExarcise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String start = "" ;
        double moneyLeft = money;
        start = scanner.nextLine();
        endTheProgram:
         while (true) {

if ((!start.equals("OutFall 4"))
               && (!start.equals("CS: OG"))
               && (!start.equals("Zplinter Zell"))
               && (!start.equals("Honored 2"))
               && (!start.equals("RoverWatch"))
               && (!start.equals("RoverWatch Origins Edition"))) {
    System.out.println("Not Found");
             } else {

    switch (start) {
        case "OutFall 4":
            money = money - 39.99;
            if (money == 0) {
                System.out.printf("Out of money!");

                break endTheProgram;
            } else if (money < 0) {
                System.out.println("Too Expensive");
                money=money +39.99;
                break;
            } else if (money > 0) {
                System.out.println("Bought OutFall 4");
                break;
            }
        case "CS: OG":
            money = money - 15.99;
            if (money == 0) {
                System.out.printf("Out of money!");
                break endTheProgram;
            } else if (money < 0) {
                System.out.println("Too Expensive");
                money=money +15.99;
                break;
            } else if (money > 0) {
                System.out.println("Bought CS: OG");
                break;
            }
        case "Zplinter Zell":
            money = money - 19.99;
            if (money == 0) {
                System.out.printf("Out of money!");
                break endTheProgram;
            } else if (money < 0) {
                System.out.println("Too Expensive");
                money=money +19.99;
                break;
            } else if (money > 0) {
                System.out.println("Bought Zplinter Zell");
                break;
            }
        case "Honored 2":
            money = money - 59.99;
            if (money == 0) {
                System.out.printf("Out of money!");
                break endTheProgram;

            } else if (money < 0) {
                System.out.println("Too Expensive");
                money=money +59.99;
                break;
            } else if (money > 0) {
                System.out.println("Bought Honored 2");
                break;
            }
        case "RoverWatch":
            money = money - 29.99;
            if (money == 0) {
                System.out.printf("Out of money!");
                break endTheProgram;
            } else if (money < 0) {
                System.out.println("Too Expensive");
                money=money +29.99;
                break;
            } else if (money > 0) {
                System.out.println("Bought RoverWatch");
                break;
            }
        case "RoverWatch Origins Edition":
            money = money - 39.99;
            if (money == 0) {
                System.out.printf("Out of money!");
                break endTheProgram;
            } else if (money < 0) {
                System.out.println("Too Expensive");
                money=money +39.99;
                break;
            } else if (money > 0) {
                System.out.println("Bought RoverWatch Origins Edition");
                break;
            }


    }

}
             start = scanner.nextLine();

if (start.equals("Game Time")) {
    System.out.printf("Total spent: $%.2f. Remaining: $%.2f",(moneyLeft-money),money);
break endTheProgram;
}

         }

    }
}

