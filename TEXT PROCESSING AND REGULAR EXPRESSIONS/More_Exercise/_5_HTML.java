package Fundamentals._28_Text_Regex_Exercise.More_Exercise;

import java.util.Scanner;

public class _5_HTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        System.out.println("<h1>");
        System.out.println(title);
        System.out.println("</h1>");
        System.out.println("<article>");
        String arcticle = sc.nextLine();
        System.out.println(arcticle);
        System.out.println("</article>");

        while (true){
            String comment = sc.nextLine();
            if(comment.equals("end of comments")){

                break;
            }
            System.out.println("<div>");
            System.out.println(comment);
            System.out.println("</div>");

        }

    }
}
