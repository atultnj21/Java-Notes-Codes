/*  Method Overloading
 means creating different implementations
 with different parameters

  declaring a method multiple times but
  with different signatures/parameters */

package com.company;

class cEmployee{
    private int baseSalary;
    private int hourlyRate;

    public cEmployee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Salary can't be 0 or -ve");
        this.baseSalary=baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <0 )
            throw new IllegalArgumentException("can't  be -ve");
        this.hourlyRate=hourlyRate;
    }

    public int calculateWage(int extraHours){
        return  baseSalary + (extraHours * hourlyRate);
    }

    //Method Overloading
    public int calculateWage(){
        return  calculateWage(0);
    }
}

public class bh_MethodOverloading {
    public static void main(String[] args) {
        var cemp = new cEmployee(50_000,20);
        System.out.println(cemp.calculateWage());//50000
        System.out.println(cemp.calculateWage(10));//50200

    }
}
