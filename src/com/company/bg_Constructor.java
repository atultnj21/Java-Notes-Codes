/* Constructor:
   A constructor is a special Method that is automatically called
   When we create a new Object */

package com.company;

class bEmployee{
    private int baseSalary;
    private int extraHours;

    //No Return type
    public bEmployee(int baseSalary,int extraHours){
        setBaseSalary(baseSalary);
        setExtraHours(extraHours);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <=0 )
            throw new IllegalArgumentException("Salary can't be 0 or -ve");
        this.baseSalary=baseSalary;
    }

    private void setExtraHours(int extraHours) {
        if(extraHours <0 )
            throw new IllegalArgumentException("hours can't  be -ve");
        this.extraHours=extraHours;
    }

    public int calculateWage(int hourlyRate){
        return  baseSalary + (extraHours * hourlyRate);
    }

}

public class bg_Constructor {
    public static void main(String[] args) {
        var emp = new bEmployee(50_000,10);
        System.out.println(emp.calculateWage(20));//50200
    }
}
