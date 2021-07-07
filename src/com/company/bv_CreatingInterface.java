/* Loosely-Coupled Code

   Solution to the previous problem
   we want our aTaxReport class to talk with an
   interface not a concrete implementation

   Dependency Injection : Our classes should not
   instantiate their dependencies
   Constructor Injection
   Setter Injection
   Normal Method

   Our aTaxReport doesn't know anything about aTaxCalculator
   it is only working with interface its the responsibilty of
   another class(main class) to inject or pass these concrete
   implementations today we are using aTaxCalculator tommorow
   we can create other class like bTaxCalculator and pass
   this to our aTaxReport, our aTaxReport is not affected */

package com.company;

/* Every class that implements me should have a public
 method with exact same signature */
interface  ITaxcalculator{

    double calculateTax();

}


class aTaxCalculator implements ITaxcalculator{
    private double taxableIncome;

    public aTaxCalculator(double taxableIncome){
        this.taxableIncome=taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome *0.3;
    }

}

class aTaxReport{
    private ITaxcalculator calculator;

    //Constructor Injection
    public aTaxReport(ITaxcalculator calculator){
        this.calculator=calculator;
    }

    public void show(){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }

}


public class bv_CreatingInterface {
    public static void main(String[] args) {
        /* We cannot make object of interface
           But we can make reference of interface */
        ITaxcalculator calculator = new aTaxCalculator(100_000);
        aTaxReport report= new aTaxReport(calculator);
        report.show();//30000.0

    }
}
