// Find the average test scores for each student in the class
// Loop1 - go through every student in the class
// loop2 - go through every test grade that student has
package loops;

import java.util.Scanner;

public class NestedForLoops {
    public static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

//        System.out.println("How many students do you have? ");
//        int numberOfStudents = scanner.nextInt();

//        process all students
        for(int i = 0; i < numberOfStudents; i++) {
            double total = 0;

            for(int j = 0; j <numberOfTests; j++) {
                System.out.println("Score for test # " + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total/numberOfStudents;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
