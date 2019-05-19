package Fundamentals._4_EcerciseBasic;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        int count = 0;


        String password = scanner.nextLine();
        for (int i = 4; i > 0; i--) {

            StringBuilder sb = new StringBuilder(password);
            String reversePass = sb.reverse().toString();
            if(!userName.equals(reversePass)){

                System.out.println("Incorrect password. Try again.");
                count++;
                if(count>=3){
                    System.out.println("User "+userName+" blocked!");
                    break;
                }

            }else {
                System.out.println("User "+userName+" logged in.");
                break;
            }

            password = scanner.nextLine();
        }



    }
}

