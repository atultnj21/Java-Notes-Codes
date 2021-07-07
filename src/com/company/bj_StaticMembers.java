/* In OOP a class can have two types of members
   Instance Members and Static Members
   Instance members belong to instances or objects

   Static or class members are feilds and Methods that
   Belong to a class not an object

    We use them in situations where we wanna
    represent a concept that should be in a single
    place  like the numberOfEmployees this concept does
    not belong to each individual employee so
    this is where we use static Members

    We use static feilds in situations where
    a value is independent of objects

    Main method is declared static to enable JRE
    to directly call this method without creating a new
    object*/

package com.company;

class eEmployee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    /* they can only see the other static methods
    in this class even though we are inside the employee
    class we cannot access the calculate wage method
    because it belongs to an employee object */

    public static void printNumberofEmployees(){
        System.out.println(numberOfEmployees);

    }

    public eEmployee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
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

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
public class bj_StaticMembers {
    public static void main(String[] args) {
        var emp = new eEmployee(50_000,10);
        var emp1 = new eEmployee(59_000,11);
        var emp2 = new eEmployee(49_000,6);

        System.out.println(eEmployee.numberOfEmployees);//3
        // we access static Members directly from the class

        eEmployee.printNumberofEmployees();

    }
}
