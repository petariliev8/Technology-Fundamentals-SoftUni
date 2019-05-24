package Fundamentals._15_Lists;

import java.util.*;

public class _6_ListOtProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        String input ="";
        List <String> products = new ArrayList<>();

        for (int i = 0; i <line; i++) {
            products.add(scanner.nextLine());
        }

        Collections.sort(products);
        for (int i = 0; i <products.size() ; i++) {
            System.out.println(i+1+"."+products.get(i));
        }
    }
}

