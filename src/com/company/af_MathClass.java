/*
Math class
In Java we have this math class that is defined in
Java.lang package, it's always there, we don't need
to import it, now this class has a number of useful
methods,like round with this we can round a floating
point number to a whole number.

in the first implementation it takes a float,
and returns an int, in the second implementation
it takes a double and returns a long,
*/
package com.company;
public class af_MathClass {
    public static void main(String[] args) {

        int result=Math.round(1.1f);
        System.out.println(result);//1

        long res =Math.round(1.1);
        System.out.println(res);//1

/*
another useful method is ceal,or ceiling which
returns the smallest integer is greater than or equal to
this number, so the ceiling of 1.1 is 2. this method returns
a double,so here we need to explicitly cast this to integer.
*/
        int a = (int)Math.ceil(1.1F);
        System.out.println(a);//2
/*
We have another useful method that is floor,so the floor
of the number is the largest integer that is smaller
or equal to this number.
*/
        int b = (int)Math.floor(1.1F);
        System.out.println(b);//1
/*
Another useful method is max, which returns the greater of
two values, similarly we have min .
*/
        int c=Math.max(1,2);
        System.out.println(c);//2

        int d =Math.min(1,2);
        System.out.println(d);//1
/*
Another useful method is random, for generating a random
value between 0 and 1.this method returns a double.

now every time we run this program, we get a different number,
and this number is a floating point number between 0 and 1.
Now, what if you want a number you can 0 to let's say 100 instead
of 0 to 1. Well, we simply multiply this,by 100
*/
        double e =Math.random();
        System.out.println(e);//0.7806296233037293

        double f =Math.random()*100;
        System.out.println(f) ;//88.48842961337844

        int g =(int)Math.round(Math.random()*100);
        System.out.println(g) ;//63

    }
}
