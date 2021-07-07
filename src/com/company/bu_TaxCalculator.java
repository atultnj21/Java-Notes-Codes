// Tightly Coupled code

/*
currently our constructor has one parameter ,if we
go to TaxCalculator and add a new parameter, our
TaxReport class is broken, this is not a big deal
in a smaller application , but what if we had 10
classes that we dependent on TaxCalculator, we will
have to modify all those classes

- Classes should not instantiate their dependencies.
 */

package com.company;

class TaxCalculator{
    private double taxableIncome;

    public TaxCalculator(double taxableIncome){
        this.taxableIncome=taxableIncome;
    }

    public double calculateTax(){
        return taxableIncome *0.3;
    }
}

class TaxReport{
    private TaxCalculator calculator;

    public TaxReport(){
        calculator=new TaxCalculator(100_000);
    }

    public void show(){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
public class bu_TaxCalculator {
    public static void main(String[] args) {
        TaxReport tr = new TaxReport();
        tr.show();//30000.0
    }
}
