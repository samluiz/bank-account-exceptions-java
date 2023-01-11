import model.entities.Account;
import model.exceptions.OutOfBalanceException;
import model.exceptions.WithdrawLimitException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account acc = new Account(number, holder, balance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("New balance: " + acc.getBalance());
        } catch (OutOfBalanceException e) {
            System.out.println("Balance error: " + e.getMessage());
        } catch (WithdrawLimitException e) {
            System.out.println("Withdraw limit error: " + e.getMessage());
        }


    }
}