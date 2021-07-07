/* POP */
package com.company;

public class bc_ProceduralOriented {
    public static void main(String[] args) {
        //calculate wage
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage  =calculateWage( baseSalary, extraHours, hourlyRate);
        System.out.println(wage);//50_200
    }
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate)
    {
        return baseSalary + (extraHours * hourlyRate);
    }

    /*
    In this style of programming we will end up with a very fat
    Main Method.
    This is what we called POP even though we are writing code
    inside of a class.
    object oriented programmin is very more than using classes and
    objects.
     */
}
