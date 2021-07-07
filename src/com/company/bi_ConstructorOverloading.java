/*Constructor Overloading:
  We can also overload constructors because technically
  constructors are also Methods */

package com.company;

class dEmployee {
    private int baseSalary;
    private int hourlyRate;

    public dEmployee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public dEmployee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or -ve");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("can't  be -ve");
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage(int extraHours){
        return  baseSalary + (extraHours * hourlyRate);
    }
}


public class bi_ConstructorOverloading {
    public static void main(String[] args) {
        var dEmp = new dEmployee(50_000);
        System.out.println(dEmp.calculateWage(0));//50_000
    }
}
