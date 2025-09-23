package com.vinay;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public  void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public  void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
            for(double balance : calculator.getRemaingBalances()){
                System.out.println(currencyInstance.format(balance));
            }


    }
}
