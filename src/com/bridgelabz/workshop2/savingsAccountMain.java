package com.bridgelabz.workshop2;

public class savingsAccountMain {
    public static void main(String[] args) {
        savingsAccount saver1 = new savingsAccount();
        savingsAccount saver2 = new savingsAccount();
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        savingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance for Saver1:: "+saver1.getSavingsBalance());
        System.out.println("New Balance for Saver2:: "+saver2.getSavingsBalance());

        savingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance for Saver1:: "+ saver1.getSavingsBalance());
        System.out.println("New Balance for Saver2:: "+ saver2.getSavingsBalance());
    }
}
