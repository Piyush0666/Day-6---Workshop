package com.bridgelabz.workshop2;

public class savingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;
    //Constructor
    public savingsAccount()
    {
        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }
    public double calculateMonthlyInterest()
    {
        double intRate = (savingsBalance * annualInterestRate/12);
        savingsBalance = savingsBalance + intRate;
        return intRate;
    }
    public static void modifyInterestRate(double latestInterestRate)
    {
        annualInterestRate = latestInterestRate;
    }
    public void setSavingsBalance(double newBal)
    {
        savingsBalance = newBal;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
}