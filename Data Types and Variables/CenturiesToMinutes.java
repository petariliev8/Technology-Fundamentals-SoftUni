package Fundamentals._6_DataTypeAndVariables;

        import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries*100;
        double days = years*365.2422;
        int hours = (int)days*24;
        int minutes = hours*60;

        double minitYear = 525948.48;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,(int)days,hours,((int)minutes));
    }
}

