package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(0);
        ATM atm = new ATM(bankAccount);
        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;

        while (!exitProgram) {
            displayMenu();

            try {
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();

                    switch (input) {
                        case 1:
                            System.out.println("Enter withdrawal amount: ");
                            int withdrawalAmount = scanner.nextInt();
                            atm.setWithdrawAmount(withdrawalAmount);
                            break;
                        case 2:
                            System.out.println("Enter deposit amount: ");
                            int depositAmount = scanner.nextInt();
                            atm.setDepositAmount(depositAmount);
                            break;
                        case 3:
                            double balance = atm.getBalance();
                            System.out.println("Your balance is R" + balance);
                            break;
                        case 4:
                            System.out.println("Exiting the program...");
                            exitProgram = true;
                            break;
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid choice.");
                    scanner.next();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer number.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("ATM MENU");
        System.out.println("1. Withdraw Money\n2. Deposit Money\n3. Check Balance\n4. Exit");

        System.out.println("Enter your choice: ");
    }
}
