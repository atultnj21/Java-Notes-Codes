package com.company;
public class am_SimplifyingIf2 {
    public static void main(String[] args) {
/*
One way to improve this, is to give this
boolean variable an initial value, for example
we can set it to false, initially, and then we
implement this condition. So if the income is
more then 100,000 dollars then we set this
variable to true. With these we no longer need
else clause.
*/
        // int income = 120_000;
        // boolean hasHighIncome=false;
        // if(income>100_000)
        //     hasHighIncome=true;
        // System.out.println(hasHighIncome);//true

/*
So that was one improvement, but
still not ideal. In situations like this,
we can completely get rid of this if
statement here
 */
        int income = 120_000;
        boolean hasHighIncome = income>100_000;
        System.out.println(hasHighIncome);//true


    }
}
