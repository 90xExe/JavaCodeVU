
package com.mycompany.lab5;

abstract class BankAccount {

    public int accNumber;
    public double balance;

    abstract double deposit();
    abstract double withdraw();
}

class SavingAccount extends BankAccount {

    public double dePosit;
    public double withDraw;

    public void setData(int acNo, double b, double d, double w) {
        accNumber = acNo;
        balance = b;
        dePosit = d;
        withDraw = w;
    }

    double deposit() {
        balance += dePosit;
        return balance;
    }

    double withdraw() {
        if (withDraw < balance) {
            balance -= withDraw;
        } else {
            System.out.println("Insufficient Balance!");
        }
        return balance;
    }

    void show() {
        System.out.println("Account Details: ");
        System.out.println("*********************************");
        System.out.println("Acc NO: IbNACC" + accNumber);
        System.out.println("Deposit Amount:" + dePosit);
        System.out.println("Withdraw Amount:" + withDraw);
        System.out.println("Balance:" + balance);
        System.out.println("*********************************");
    }
}

public class repoabstact2 {
        public static void main(String[] args) {
        SavingAccount a1 = new SavingAccount();
        a1.setData(232311210, 30000, 1000, 25000);
        a1.deposit();

        a1.withdraw();
        a1.show();
    }
}
