/*
payments schedule,  this shows the remaining
balance after each payment
*/
package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class au_PaymentScheduleMortgage {
    final static byte MONTH_IN_YEAR=12;
    final static  byte PERCENT=100;

    public static void main(String[] args) {

        int principal=(int)readNumber("principal: ",1_001,1_000_000);
        float annualInterest=(float)readNumber("Annual Interest Rate: ",0,30);
        byte years=(byte)readNumber("Years: ",0,30);
        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    public static void printMortgage(int principal, float annualInterest, byte years) {
        double Mortgage= calculateMortgage(principal, annualInterest, years);
        String formattedMortgage = NumberFormat.getCurrencyInstance(Locale.US).format(Mortgage);

        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments: " + formattedMortgage);

    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("_________________");
        for (short month = 1; month<= years *MONTH_IN_YEAR ; month++){
            double balance=calculateBalance(principal, annualInterest, years,month);
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(balance));
        }
    }

    public static double readNumber(String prompt,int min,int max){
        Scanner sc = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = sc.nextDouble();
            if(value>min && value<=max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static double calculateMortgage(int principal ,float annualInterest,byte years ){

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        int noOfMonths = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, noOfMonths))
                / (Math.pow(1 + monthlyInterest, noOfMonths) - 1);

        return mortgage;
    }

    /*
    B=L[ (1+c)^n -(1+c)^p]/[(1+c)^n-1]
    B-> Balance
    L-> Loan Amount
    c-> Monthly Interest
    n-> months(total noOfPayments)
    p-> no of payments we have made
    */
    public static double calculateBalance(int principal, float annualInterest, byte years,short noOfPaymentsMade){

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        int noOfMonths = years * MONTH_IN_YEAR;

        double balance=principal
                *(Math.pow(1+ monthlyInterest , noOfMonths) - Math.pow(1+ monthlyInterest , noOfPaymentsMade))
                / (Math.pow(1+ monthlyInterest , noOfMonths)-1);

        return balance;

    }
}
