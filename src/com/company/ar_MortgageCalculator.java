/* Mortgage Calculator */

/*
changed this question by adding this label that
identifies the range of values we can enter, so
the minimum  amount of loan we can get is 1,000
dollars and maximum is 1 million dollars.
for Annual interest rate we need to enter
a value that is greater than 0, but less
than or equal to 30,it is same for years

you want to validate the value the user enters, if the
value is invalid, you want to keep asking the same
question, so this is where we can use an infinite loop.
*/

package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ar_MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR=12;
        final byte PERCENT=100;

        Scanner sc = new Scanner(System.in);

            int principal=0;
            while(true){
            System.out.print("Principal ($1K - $1M)");
            principal = sc.nextInt();
            if(principal>=1000 && principal<=1_000_000)
                break;
                System.out.println("Enter a value between 1,000 and 1,000,000");
            }

            float monthlyInterest=0;
            while(true) {
                System.out.print("Annual Interest Rate");
                float annualInterest = sc.nextFloat();
                if(annualInterest>=1 && annualInterest<=30){
                monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
                break;
                }
                else
                System.out.println("Enter a value between 1 to 30");
            }

            int noOfMonths=0;
            while (true){
            System.out.print("Period: ");
            byte years = sc.nextByte();
            if(years>0 && years<=30){
            noOfMonths = years * MONTH_IN_YEAR;
            break;
            }
            else{
                System.out.println("Enter a value between 1 to 30");
            }
            }

            double Mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, noOfMonths))
                / (Math.pow(1 + monthlyInterest, noOfMonths) - 1);

            String m = NumberFormat.getCurrencyInstance(Locale.US).format(Mortgage);
            System.out.print("Mortgage: ");
            System.out.println(m);
/*
The problem is that this code, the code inside the main method is
now getting a little bit too long, and this hurts the maintainability
of our program. Someone else reading this code would have to look at
all the statements to figure out what's going on this is what you
need to break this code down into smaller, easier to read and easier
to understand
 */
    }
}
