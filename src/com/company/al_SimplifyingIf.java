/* Simplyfying if statement */

package com.company;
public class al_SimplifyingIf {
    public static void main(String[] args) {
/*
let's say you want to declare boolean value called
hasHighIncome,if the income is more then 100,000
you want to set this to true,otherwise we want to
set this to false.
*/

        int income = 120_000;

        //if(income>100_000){
        //boolean hasHighIncome=true;
        //}

/*
This variable that we defined is
Scoped to this code block(if block),
it's only available here.We cannot
access it outside of this block.
*/
        boolean hasHighIncome;

            if(income>100_000)
                hasHighIncome=true;
            else
                hasHighIncome=false;
            System.out.println(hasHighIncome);//true

//This is one way of doing this
    }
}
