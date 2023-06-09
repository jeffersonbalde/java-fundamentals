package decision_structure;

import java.util.Scanner;

public class GradeMessage{
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner input = new Scanner(System.in);
        String grade = input.next();
        input.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to take a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid Grade";
        }

        System.out.println(message);
    }
}
