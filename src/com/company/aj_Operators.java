/* Operators */
package com.company;

public class aj_Operators {
    public static void main(String[] args) {

/* Comparison Operator */
        int x=1;
        int y=1;
        //is x equals to y
        System.out.println(x==y);//true
        // x>y ?
        System.out.println(x>y);//false
        //x<y?
        System.out.println(x<y);//false
        //x! =y
        System.out.println(x!=y);//false
        //x<=y
        System.out.println(x<=y);//true

/* Logical Operators */
        int temperature=22;
/*
logical AND
if both these conditions are true the result of the
boolean expression is gonna be true
*/
        boolean isWarm = temperature >20 && temperature<30;
        System.out.println(isWarm);//true
/*
logical OR
if at least one condition is true, then
result will be true

an applicant is eligible for loan if they have high
income 'or' good credit . If one of these conditions is
true,they are eligible.
*/
        boolean hasHighIncome=false;
        boolean hasGoodCredit=true;
        boolean isEligible=hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);//true

    }
}
