package games;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRools = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! let's begin...");

        for (int i = 0; i < maxRools; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));


            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.print("Unfortunately, that takes you past " + lastSpace + " space. You lose!");
                break;
            } else if (i == maxRools && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");

            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();


        }
    }
}
