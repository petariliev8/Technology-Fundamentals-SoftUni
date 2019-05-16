package Fundamentals._28_Text_Regex_Exercise;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class _3_Extract_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String fileName = input.substring(input.lastIndexOf('\\')+1
                ,input.lastIndexOf('.'));
        String extension = input.substring(input.lastIndexOf('.')+1);
        System.out.println("File name: "+fileName);
        System.out.println("File extension: "+extension);

    }
}
