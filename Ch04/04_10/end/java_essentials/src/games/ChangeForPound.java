package games;

import java.util.Scanner;

public class ChangeForPound {
    public static void main(String[] args) {
        double penny = .01;
        double fivePence = .05;
        double tenPence = .10;
        double fiftyPence = .25;
        int pound = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Pound!' Your goal is to enter enough change to make exactly £1.00");

        System.out.println("Enter your number of pennies: ");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter your number of fivePence: ");
        int numberOfFivePence = scanner.nextInt();

        System.out.println("Enter your number of tenPence: ");
        int numberOfTenPence = scanner.nextInt();

        System.out.println("Enter your number of fiftyPence: ");
        int numberOfFiftyPence = scanner.nextInt();

        scanner.close();

        double total = (numberOfPennies * penny) + (numberOfFivePence * fivePence) + (numberOfTenPence * tenPence) + (numberOfFiftyPence * fiftyPence);

        if (total < pound) {
            double amountShort = pound - total;
            System.out.println("Sorry, you lose! You were " + String.format("%.2f" ,amountShort) + "p " + " shorter to a pound ");

        } else if (total > pound) {
            double amountOver = total - pound;
            System.out.println("Sorry, you lose! You were " + String.format("%.2f", amountOver) + "p " + " over to a pound ");
        } else {
            System.out.println("Well done! that's exactly £1.00! you win!");
        }
    }
}
