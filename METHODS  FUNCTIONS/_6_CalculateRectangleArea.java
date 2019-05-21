package Fundamentals._12_Functions;

import java.util.Scanner;

public class _6_CalculateRectangleArea {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        double width = Double.parseDouble(sc.nextLine());
        double hight = Double.parseDouble(sc.nextLine());

        int area = calcArea(width, hight);

        System.out.println(area);
    }

    static int calcArea(double width, double hight) {
        double result = width * hight;
        String format = String.format("%.0f", result);
        int res = Integer.parseInt(format);

return res;
    }

}