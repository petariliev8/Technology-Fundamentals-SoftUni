package Fundamentals._13_ExerciseMethods;

import java.util.Scanner;

public class _9_Palindrome_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String forward = scanner.nextLine();

        while (!forward.equals("END")) {

            backward(forward);
            forward = scanner.nextLine();
        }
    }
    public static void backward (String forward){

        String reverseUsername = new StringBuilder(forward).reverse().toString();
      if (reverseUsername.equals(forward)) {
          System.out.println("true");
      }else {
          System.out.println("false");
      }
    }
}

