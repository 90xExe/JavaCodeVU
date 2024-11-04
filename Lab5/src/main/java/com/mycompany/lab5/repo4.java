
package com.mycompany.lab5;


class Account{
    private int accountNo;
    private double balance;
    public static int count = 0;
   
    Account(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
        count++;
    }
    public double getBalance(){
        return balance;
    }
}
public class repo4 {
     public static void main(String[] args) {
        
        Account a1 = new Account(100, 345.6);
        Account a2 = new Account(101, 343.6);
        Account a3 = new Account(102, 432.5);
         Account a4 = new Account(103, 432.5);
        
        System.out.println("No of Accounts: " + Account.count);
        
        double averageBalance = (a1.getBalance() + a2.getBalance() + a3.getBalance() ) / 3;
        
        System.out.println("Average balance: " + averageBalance);
        
        
    }
}
