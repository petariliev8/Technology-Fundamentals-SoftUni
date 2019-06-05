package Fundamentals._18_ObjectsClasses;

import java.util.Random;

public class Dice {
   private  int sides;
   private  String type;

   public  Dice (int sides, String type){
  this.sides = sides;
  this.type = type;
   }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void  roll (){
       Random random = new Random();
        System.out.println(random.nextInt(this.sides));
    }
}

