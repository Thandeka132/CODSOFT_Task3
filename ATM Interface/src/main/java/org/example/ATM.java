package org.example;

public class ATM {

    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    public void setWithdrawAmount(int withdrawAmount) {
        bankAccount.withdraw(withdrawAmount);
    }

    public void setDepositAmount(int depositAmount) {
        bankAccount.deposit(depositAmount);
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }


}
