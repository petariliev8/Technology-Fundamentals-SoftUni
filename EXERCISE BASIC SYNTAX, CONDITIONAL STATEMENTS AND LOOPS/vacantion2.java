package Fundamentals._4_EcerciseBasic;

        import java.util.Scanner;

public class vacantion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Double.parseDouble(scanner.nextLine());
        String kind = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double Allprice =0 ;

        switch (kind) {
            case "Students" :
                if (day.equals("Friday")) {
                    price = 8.45;
                } else  if (day.equals("Saturday")) {
                    price = 9.80;
                }else  if (day.equals("Sunday")) {
                    price = 10.46;
                }
                if (people>=30) {
                    Allprice = (people*price)*0.85;
                } else {
                    Allprice = (people*price);
                }
                break;

            case "Business":
                if (day.equals("Friday")) {
                    price = 10.9;
                } else  if (day.equals("Saturday")) {
                    price = 15.6;
                }else  if (day.equals("Sunday")) {
                    price = 16;
                }
                if (people>=100) {
                    people = people-10;
                }
                    Allprice = (people*price);

                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else  if (day.equals("Saturday")) {
                    price = 20;
                }else  if (day.equals("Sunday")) {
                    price = 22.50;
                }
                if ((people>=10)&& (people<=20)) {
                    Allprice = (people*price)*0.95;
                } else {
                    Allprice = (people*price);
                }
                break;
        }

        System.out.printf("Total price: %.2f",(Allprice));

    }
}

