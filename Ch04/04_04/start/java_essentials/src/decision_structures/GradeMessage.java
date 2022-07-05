package decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

    public static void main(String[] args){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade.toUpperCase()){
            case "A":
                message = "Excellent job!";
                System.out.println(message);
                break;
            case "B":
                message = "Great job!";
                System.out.println(message);
                break;
            case "C":
                message = "Good job!";
                System.out.println(message);
                break;
            case "D":
                message = "You need to work a bit harder";
                System.out.println(message);
                break;
            case "F":
                message = "Try harder next time";
                System.out.println(message);
                break;
        }

    }
}

