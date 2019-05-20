package Fundamentals._6_DataTypeAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                char a = scanner.nextLine().charAt(0);


                if(((char)a>=97) && ((char)a<=122)) {
                    System.out.println("lower-case");

        } else if (((char)a>=65) && ((char)a<=90)) {
                    System.out.println("upper-case");

                }



    }
}

