/*
Mortgage Calculator

Refactoring means changing the structure of our
code, without changing it's behavior
*/

package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class at_RefactoringMortgageCalculator {
    public static void main(String[] args) {

        int principal=(int)readNumber("principal: ",1_001,1_000_000);
        float annualInterest=(float)readNumber("Annual Interest Rate: ",0,30);
        byte years=(byte)readNumber("Years: ",0,30);
        String Mortgage= calculateMortgage( principal , annualInterest,  years );
        System.out.println(Mortgage);

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
    public static String calculateMortgage(int principal ,float annualInterest,byte years ){
        final byte MONTH_IN_YEAR=12;
        final byte PERCENT=100;

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        int noOfMonths = years * MONTH_IN_YEAR;

        double Mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, noOfMonths))
                / (Math.pow(1 + monthlyInterest, noOfMonths) - 1);

        String m = NumberFormat.getCurrencyInstance(Locale.US).format(Mortgage);
        return m;
    }

}
