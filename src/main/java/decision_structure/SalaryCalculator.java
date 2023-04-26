package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = 1000;
        double bonus = 200;
        int quota = 10;
        int sales;

        System.out.println();
        System.out.println("How many sales did the employee get this week? ");
        sales = input.nextInt();

        if(sales > quota) {
            salary = salary + bonus;
        }

        System.out.println("Salary: " + salary);
    }
}