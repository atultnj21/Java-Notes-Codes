/* Casting / Type conversion */

package com.company;
public class ae_casting {
    public static void main(String[] args) {
/*
Because we are dealing with two different types
of values, one is a short, the other is an integer,
one of these values should be converted to the other
type so they are equal. short - 2bytes integer-4bytes
So any values that we store in a short variable, can
also be stored in an integer variable.

First Java looks at the value in this variable (x), it's one.
then it's going to allocate another variable, an anonymous
variable somewhere in memory we don't know where that is,
we don't know the name of that variable, it doesn't have a name.
It's anonymous. That variable is going to be an integer, then
Java is going to copy the value of x into that memory space and
then it will add these two numbers together. This is what we
call " implicit casting" .

Whenever we have a value and that value can be converted to
a type that is bigger, casting or conversion happens
implicitly or automatically.
*/
        short x=1;
        int y = x+2;
        System.out.println(y);//3

/*
floating point numbers

we have a compilation error, because on the right side of the
assignment operator, we have a floating point number, a double
on the left side we have an integer. So we need to change this
to double.

In this case we're dealing with a  double, and an integer. An
integer is less precise then a double. Because in a double, we can
have digits after the decimal point. So, in this
example, Java is going to automatically cast this integer to
double, so that would be 2.0, and then 2.0 will be added to 1.1.

So as a general rule of thumb, implicit casting happens whenever
we're not going to lose data
*/
        double a =1.1;
        //int b = a+2;
        double b =a+2;
        System.out.println(b);//3.1

/*
if you want n to be an integer, so this example, you don't care
about the digits after the decimal point, we want to see 3 on
the terminal. This is where we should "explicitly" cast the result
we should cast m to an integer

explicit casting can only happen between compatible types. So
all these types are compatible because they are all numbers.
*/
        double m=1.1;
        int n = (int)m+2;
        System.out.println(n);//3
/*
we cannot cast a string to a number.
in Java we have a class which is a reference type called
integer, this class is defined in Java.lang package, and
in this class we have a method called parse int, so this
method takes a string and returns an integer. So integer
is the wrapper class.

similarly we have
Float.parseFloat()
Double.parseDouble()
*/
        String c="1";
        //int d = (int)c+2;  error:inconvertible types
        int d = Integer.parseInt(c)+2;//3

        String sh = "1";
        int result= Short.parseShort(sh)+2;
        System.out.println(result);//3

    }
}
