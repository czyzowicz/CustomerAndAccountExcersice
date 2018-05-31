package CustomerAndAccountExcersice;

import java.util.Scanner;

public class CustomerAndAccountDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(034,"Jack",Gender.male);
        Account account = new Account(865903,customer,0.00);
        Scanner input = new Scanner(System.in);
        System.out.println("How many money do you want to deposit:");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        System.out.println("In your account is " + account.getBalance());
        System.out.println("How many money do you want to withdraw:");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
