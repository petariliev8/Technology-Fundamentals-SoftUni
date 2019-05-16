package Fundamentals.Exam_Preparation.Exam_Mid_december_2018;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Present_Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    List<Integer> houseList = Arrays.stream(sc.nextLine().split("@"))
            .map(Integer::parseInt).collect(Collectors.toList());
    int currentPosition = 0;

    while (true){
        String [] input = sc.nextLine().split(" ");

        if(input[0].equals("Merry")){
    break;

        }
        int jump = Integer.parseInt(input[1]);

        if (currentPosition+jump < houseList.size()){
            currentPosition += jump;

            if(houseList.get(currentPosition)>2){
                houseList.set(currentPosition,houseList.get(currentPosition)-2);
            }else if(houseList.get(currentPosition)<=2 && houseList.get(currentPosition)>0){
                houseList.set(currentPosition,0);
            }else {
                System.out.println("House "+currentPosition+" will have a Merry Christmas.");
            }
        }else {
            currentPosition = (currentPosition+jump) % houseList.size();
            if(houseList.get(currentPosition)>2){
                houseList.set(currentPosition,houseList.get(currentPosition)-2);
            }else if(houseList.get(currentPosition)<=2 && houseList.get(currentPosition)>0){
                houseList.set(currentPosition,0);
            }else {
                System.out.println("House "+currentPosition+" will have a Merry Christmas.");
            }
        }




    }
        int faild = 0;
        for (int i = 0; i < houseList.size(); i++) {
            if(houseList.get(i)>0){
                faild++;
            }
        }
        if (faild==0){
            System.out.println("Santa's last position was "+currentPosition+".");
            System.out.println("Mission was successful.");
        }else{
            System.out.println("Santa's last position was "+currentPosition+".");
            System.out.println("Santa has failed "+faild+" houses.");
        }



    }
}
