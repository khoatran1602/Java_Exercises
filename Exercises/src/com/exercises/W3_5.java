Main class
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        account.getMonthlyInterest();
    }
}
-----------------------------------------------------------
Account class
package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    private int ID;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;

    public Account() {}

    public Account(int newID, double newBalance, double newAnnualInterestRate) {
        this.ID = newID;
        this.balance = newBalance;
        this.annualInterestRate = newAnnualInterestRate;
        this.dateCreated = LocalDate.now();
        System.out.println("The account is created in " + this.dateCreated);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void withdraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
        System.out.println("Your balance after withdraw is: " + balance);
    }

    public void deposit(double depositAmount) {
        balance = balance - depositAmount;
        System.out.println("Your balance after deposit is: " + balance);
    }

    public void getMonthlyInterest() {
        System.out.println("Your monthly interest is " + balance * ((annualInterestRate / 100) / 12));
    }
}
