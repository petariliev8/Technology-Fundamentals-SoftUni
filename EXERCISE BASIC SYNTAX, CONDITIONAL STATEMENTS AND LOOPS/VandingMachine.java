package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class VandingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum = 0;
        double allsum = 0;
        pesho:
        while (true) {
            String input = scanner.nextLine();
            if (((!input.equals("Start")) && (!input.equals("End")))) {
                sum = Double.parseDouble(input);
                if ((sum != 0.01) && (sum != 0.02) && (sum != 0.05) && (sum != 0.1) &&
                        (sum != 0.2) && (sum != 0.5) && (sum != 1) && (sum != 2)) {
                    System.out.printf("Cannot accept %.2f", sum);
                    System.out.println();
                } else {
                    allsum += sum;
                }

            } else if (input.equals("Start")) {
                while (true) {
                    input = scanner.nextLine();
                    if (input.equals("End")) {
                        System.out.printf("Change: %.2f", Math.abs(allsum));
                        break pesho;
                    }
                    if ((!input.equals("Nuts")) && (!input.equals("Water")) && (!input.equals("Crisps")) &&
                            (!input.equals("Soda")) && (!input.equals("Coke"))) {
                        System.out.println("Invalid product");
                    } else {
                        switch (input) {

                            case "Nuts":
                                allsum -= 2;
                                if (allsum < 0) {
                                    System.out.println("Sorry, not enough money");
                                    break;
                                } else {
                                    System.out.println("Purchased Nuts");
                                    break;
                                }
                            case "Water":
                                allsum -= 0.7;
                                if (allsum < 0) {
                                    System.out.println("Sorry, not enough money");
                                    break;
                                } else {
                                    System.out.println("Purchased Water");
                                    break;
                                }
                            case "Crisps":
                                allsum -= 1.5;
                                if (allsum < 0) {
                                    System.out.println("Sorry, not enough money");
                                    break;
                                } else {
                                    System.out.println("Purchased Crisps");
                                    break;
                                }
                            case "Soda":
                                allsum -= 0.8;
                                if (allsum < 0) {
                                    System.out.println("Sorry, not enough money");
                                    break;
                                } else {
                                    System.out.println("Purchased Soda");
                                    break;
                                }
                            case "Coke":
                                allsum -= 1;
                                if (allsum < 0) {
                                    System.out.println("Sorry, not enough money");
                                    break;
                                } else {
                                    System.out.println("Purchased Coke");
                                    break;
                                }
                        }
                    }

                }
            }
        }

    }
}

