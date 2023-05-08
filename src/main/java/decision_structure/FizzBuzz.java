package decision_structure;
import java.util.Scanner;

/*
    Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    For numbers which are multiples of both three and five return 'FizzBuzz'.
    For numbers that are neither, return the input number.
 */
public class FizzBuzz {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int inputNum = getNum();
        checkNum(inputNum);
    }

    public static int getNum() {
        System.out.println();
        System.out.print("Enter num: ");
        int num = scanner.nextInt();

        return num;
    }

    public static void checkNum(Integer num) {
        String result = "";
        if (num % 3 == 0) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = num.toString();
        }
        System.out.println(result);
    }
}