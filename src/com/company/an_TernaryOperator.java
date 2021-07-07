/* Ternary Operator */
package com.company;

public class an_TernaryOperator{
    public static void main(String[] args) {
        int income=120_000;
/*
this is the income of our customers, now depending on their
income, we want to put these customers in different classes,
if their income is more then 100,000 dollars, we want to
put them in the first class, otherwise we want to put them
in economy class

first we have a condition, if this condition
is true, first value will be returned and assigned
to our class, otherwise this other value will be returned.
 */
        String className = (income>100_000)? "First":"economy";
        System.out.println(className);//first
    }
}
