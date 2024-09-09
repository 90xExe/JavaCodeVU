
package com.mycompany.labreport2;




public class bankacc {
   
    private String accountHolderName;
    private String address;
    private String accountNumber;
    private double balance;

 
    public bankacc(String accountHolderName, String address, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }


    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            displayBalance();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            displayBalance();
        } else if (amount > balance) {
            System.out.println("Insufficient balance for this withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public static void main(String[] args) {
        // Creating a BankAccount object
        bankacc myAccount = new bankacc("Nazim Noyon", "BGB Camp,Rajshahi", "A123M56", 500.0);

        // Displaying account details
        myAccount.displayAccountDetails();

        // Depositing money
        myAccount.deposit(150.0);

        // Withdrawing money
        myAccount.withdraw(200.0);

        // Attempting to withdraw more than balance
        myAccount.withdraw(600.0);
    }
}