/*  Mortgage Calculator
    Project

Formula for calculating Mortgage:
M= ( P*( r(1+r)^n/(1+r)^n-1))

M-> Mortgage
P ->principal

r ->monthly intrest rate calculated by dividing your
annual Intrest Rate by 12
(this is present as percentage divide by
100 for Actual intrest Rate)

n -> time(in months)
(period x12 for months)
*/

package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ai_MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualIntrest= sc.nextFloat();
        float monthlyIntrest= annualIntrest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period(years): ");
        byte years = sc.nextByte();
        int numberOfMonths=years*MONTHS_IN_YEAR;



 double Mortgage =principal
         *(monthlyIntrest * Math.pow(1+monthlyIntrest,numberOfMonths))
         /(Math.pow(1+monthlyIntrest,numberOfMonths)-1);

 String m=NumberFormat.getCurrencyInstance(Locale.US).format(Mortgage);
        System.out.print("Mortgage: ");
        System.out.println(m);
/*
Principal: 100000
Annual Interest Rate: 3.92
Period(years): 30
Mortgage: $472.81
*/
    }
}
