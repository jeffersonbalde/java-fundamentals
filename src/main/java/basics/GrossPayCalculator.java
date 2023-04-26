package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("How many hours did you work? ");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = input.nextDouble();
        input.close();

        double payRate = hours * rate;

        System.out.println("Gross Pay: " + payRate);
    }
}