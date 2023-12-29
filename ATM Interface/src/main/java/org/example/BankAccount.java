package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(int withdrawAmount) {
        if(withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("You have successfully withdrew R" + withdrawAmount + ".\nYour remaining balance is R" + balance + ".");
        } else{
            System.out.println("You have insufficient funds.");
        }
    }

    public void deposit(int depositAmount) {
        if(depositAmount > 0) {
            balance += depositAmount;
            System.out.println("You have successfully deposited R" + depositAmount + ".\nYour current balance is R" + balance +".");
        } else {
            System.out.println("Please enter a valid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}
