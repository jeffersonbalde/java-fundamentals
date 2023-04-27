package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner input = new Scanner(System.in);
        String grade = input.next();
        input.close();

//        Lambda Expression
        String message = switch (grade) {
//            case "A" -> "Excellent job!";
            case "A", "a" -> "Excellent job";
            case "B" -> "Great job!";
//            case "B" -> {
//                System.out.println("You can add multiple statements as long as the final line is has a yield");
//                yield "Great job!";
//            }
            case "C" -> "Good job!";
            case "D" -> "You need to take a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid Grade";
        };

        System.out.println(message);
    }
}
