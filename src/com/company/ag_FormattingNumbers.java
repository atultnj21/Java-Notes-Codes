/* Formatting Numbers */
package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class ag_FormattingNumbers {
    public static void main(String[] args) {
/*
Quite often when we work with numbers we need to
format them as currency values.
we want to add a dollar sign here and separate
every three digits with a comma.
1234567 -> $1,234,567
Or you might have a number like 0.1 and you want
to represent this as a  percentage value. So,
instead of 0.1, you want to say 10%.

we have this class NumberFormat that is defined
in Java.text package, in this package we have
a lot of classes for handling text, dates,
numbers and so on.
*/
        //NumberFormat currency = new NumberFormat() ;
/*
we get a compilation error here,Number format is abstract,
it cannot be instantiated,n Java we have this concept of
abstract classes, so some classes are abstract and they
are basically like a half baked cake, you cannot use the
new operator to create an instance of them

This class has a bunch of methods that start with get.
So we have get currency instance, and when we call this
method this will create an instance of the number format
class and return it, so instead of using the new operator,
we're going to use this method here.
return type of this method, it's a numberformat object.

now this object has a method for formatting values,
Now this method will return a string representation
of this number formatted as a currency.

*/
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result =currency.format(123456.891);
        System.out.println(result);//₹123,456.89

String r=NumberFormat.getCurrencyInstance(Locale.US).format(456724);
        System.out.println(r);//$456,724.00

   String percent=NumberFormat.getPercentInstance().format(0.1);
        //Method Chaining
        System.out.println(percent);//10%

    }
}
