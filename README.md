ATM Simulator

#Requirements
1. Java Development Kit (JDK) installed on your system.
2. A Java IDE or compiler to compile and run the program.

#Functionality
Withdraw Money:
    Allows users to withdraw money from their bank account.
    Checks if the withdrawal amount is valid and if the account has sufficient funds.

Deposit Money:
    Allows users to deposit money into their bank account.
    Validates the deposit amount to ensure it is positive.

Check Balance:
    Displays the current balance of the bank account.

Exit Program:
    Allows users to exit the ATM program.

#Classes
1. ATM
    Manages interactions between the user and the bank account.
    Contains methods to set withdrawal and deposit amounts, as well as retrieve the current balance.

2. BankAccount
    Represents a bank account with a balance.
    Contains methods to withdraw money, deposit money, and retrieve the current balance.

3. Main
    Contains the main method to run the ATM program.
    Displays the ATM menu and handles user input.

#Running the Program
Compile:
    Compile all Java files (ATM.java, BankAccount.java, Main.java).

Run:
    Run the compiled Main class.

Usage:
    Follow the on-screen prompts to perform transactions:
        Enter 1 to withdraw money.
        Enter 2 to deposit money.
        Enter 3 to check balance.
        Enter 4 to exit the program.
