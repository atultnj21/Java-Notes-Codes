/* Encapsulation(The first principle of OOP):-
Bundle the data and methods that operate on the data
in a single unit */

package com.company;

class Employee{
    public int baseSalary;
    public int extraHours ;

//we use static only when we need to call the method form main

    public int calculateWage(int hourlyRate){
        return  baseSalary + (extraHours * hourlyRate);
    }
}


public class bd_Encapsulation {
    public static void main(String[] args) {
        var Employee = new Employee();
        Employee.baseSalary = 50_000;
        Employee.extraHours = 10;

        int wage= Employee.calculateWage(20);
        System.out.println(wage);//50_200
    }
}
