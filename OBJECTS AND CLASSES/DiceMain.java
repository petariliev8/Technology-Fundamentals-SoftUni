package Fundamentals._18_ObjectsClasses;

public class DiceMain {
    public static void main(String[] args) {
        Dice dice = new Dice(6,"asd");
        Dice dice1 = new Dice(7,"bsd");
        Dice dice2 = new Dice(8,"csd");


        dice.roll();
        dice.roll();
        dice.roll();
        dice.roll();
        dice.roll();
        dice.roll();

    }
}

