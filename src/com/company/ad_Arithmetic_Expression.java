/* Arithmetic Expression */
package com.company;

public class ad_Arithmetic_Expression {
    public static void main(String[] args) {
/*
In Java. So, in Java we have the same arithmetic
operators we have in math. We have addition,
subtraction, multiplication division and modulus

division is an interesting one
the result is a whole number, because
using Java the division of two whole numbers
is a whole number. If you want to get a floating
point number here, you need to convert these numbers
to a float or a double.
*/
        int add = 10+3;
        System.out.println(add);//13
        int sub = 10-3;
        System.out.println(sub);//7
        int mul=10*3;
        System.out.println(mul);//30

        int div = 10/3;
        System.out.println(div);//3

        float division=10.0f/3;
        System.out.println(division);//3.3333333
        double d = (double)10/(double) 3;
        System.out.println(d);//3.3333333333333335

/* increment/decrement operators */

        int x=1;
        x++;
        System.out.println(x);//2

        int y =1;
        ++y;
        System.out.println(y);//2
/*
however, if we use this on the right side of an assignment
operator we get different results.

first the value of a will get copied to b, so b will be 1,
and then a will be incremented by 1.
*/
        int a=1;
        int b =a++;
        System.out.println(a);//2
        System.out.println(b);//1
/*
first e will be incremented by 1, so it will be 2, and then
it will be copied to f. So in this case both e and f
will be 2,
*/
        int e=1;
        int f=++e;
        System.out.println(e);//2
        System.out.println(f);//2

        int n=1;
        n=n+2;
        System.out.println(n);//3

        int m=1;
        //augmented or compound assignment operator
        m+=2;
        System.out.println(m);//3

/*
order of operations
  ()
  / *
  + -
*/
        int num=10+3*2;
        System.out.println(num);//16
        int num1=(10+3)*2;
        System.out.println(num1);//26

    }
}
