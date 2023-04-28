package arrays;

import org.example.Main;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();

        for(int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH; i++) {
             int randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
             ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
//        for each loop
        for (int value : array){
            if(value == numberToSearchFor) return false;
        }
        return false;
    }
}
