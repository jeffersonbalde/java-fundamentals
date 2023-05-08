package methods;

/*
    Customer name, account number,email, balance, phone number
    Deposit money, withdraw money
 */

import java.util.Scanner;

public class BankingApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Account jeffAccount = new Account("09187305985", 0.0, "jeffersonbalde", "jef@gmail.com", "09187305985");

        int depositAmount = amountToDeposit();
        jeffAccount.DepositMoney(depositAmount);
        int withdrawAmount = amountToWithdraw();

        while(withdrawAmount > jeffAccount.getBalance()) {
            System.out.println("Invalid Amount. Your balance is " + jeffAccount.getBalance());
            System.out.print("Enter your new amount: ");
            withdrawAmount = scanner.nextInt();
        }

        jeffAccount.WithDraw(withdrawAmount);
    }

    public static int amountToDeposit() {
        System.out.println();
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        return amount;
    }

    public static int amountToWithdraw() {
        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        return amount;
    }
}


class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    // Method
    public void DepositMoney(double depositmoney) {
        this.Balance += depositmoney;
        System.out.println("Successfully deposit " + depositmoney + " in your account");
        System.out.println("Your balance is " + this.Balance);
    }

    public void WithDraw(double withdraw) {
        if(this.Balance - withdraw < 0) {
            System.out.println("Invalid Amount. Your balance is " + this.Balance);
        }else {
            this.Balance -= withdraw;
            System.out.println("Withdraw successfully.Your new balance is " + this.Balance);
        }
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public String getNumber() {
        return Number;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPhoneNumber(String phonenumber) {
        this.PhoneNumber = phonenumber;
    }
}