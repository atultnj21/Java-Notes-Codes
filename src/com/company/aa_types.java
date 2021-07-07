/* Types */
package com.company;
import java.awt.*;
import java.util.Date;

public class aa_types {
    public static void main(String[] args) {
/*
* Variables *

Imagine in they program you want to store someone's
age in the memory.So, we declare a variable like this
int age=30.So int or integer is the type of this variable,
so in this variable we can only store integers which
are whole numbers, like 1, 2, 3, 4, numbers that don't
have a decimal point.

int age = 30;
your initializing a variable, which means your giving it an
initial value
*/
        int age = 30;
        System.out.println(age); //30
        age = 35;
        System.out.println(age);//35
        int myAge=30;
        int herAge=myAge;
        System.out.println(herAge);//30
/*
* Types in java *

primitive - for storing simple values
reference - for storing complex objects

primitive types
Type    Bytes    Range
byte      1     [-128,127]
short     2     [-32K,32K]
int       4     [-2B ,2B]
long      8
float     4
double    8
char      2      A,B,C...
boolean   1      true/false
*/
        byte newAge=40;
        System.out.println(newAge);//40
        int viewsCount=123_456_789;//to make more readable
        System.out.println(viewsCount);//123456789

/*
         int viewCounts=3123456789;
         integer no too large

         double viewCounts =31234456789;
         still throws error because by default java sees these
         numbers as integers to solve this prob,you need to add
         L or l as a suffix to this number.
*/
        double viewCounts =31234456789L;
        System.out.println(viewCounts);//31234456789

        double price =10.99;
        System.out.println(price);//10.99
/*
        float newPrice =10.89;
        throws error because,
        by default java sees these numbers as double
        to solve this prob,you need to add
        f or F as a suffix to this number.
*/
        float newPrice =10.89F;
        System.out.println(newPrice); //10.89;

/*      single characters with single ''
        Multiple character/strings with "" */

        char letter='A';
        System.out.println(letter);//A

        boolean isEligible =true;
        System.out.println(isEligible);//true

/*  Reference Type
    here we need to use the new operator to
    allocate memory for this variable. And
    this is one of the differences between the
    primitive and reference types. In primitive types,
    we don't need to allocate memory. Memories allocate
    and release by Java run time environments. But when
    dealing with reference types,we should always allocate
    memory. Now we don't have to release this memory.
    Java runtime environment will automatically take care of that.

     this variable we have defined here, is an instance of the
     date class.

     these classes have members/method that can be accessed using '.'
     primitive types dont have members

*/
        Date now =  new Date();
        System.out.println(now);//Mon Jun 14 18:03:17 IST 2021

/*
Primitive Types vs Reference types

  there is a very important difference between these two
  categories of types in terms of memory management

  variables, x and y, and these two variables are at different
  memory locations, so they're completely independent of each
  other.if I changed the value of x is not going to affect it.

  So this is the critical difference between primitive and reference
  types. When we declare a primitive value like a byte, the value
  that we assigned to that variable will be assigned to that memory
  location. But when we use a reference type like this point class our
  variable is going to be told the address of that point object in memory,
  not the actual point object.

  they don't store the actual values
  they store a reference to an object, somewhere in the memory.
  So in this example point1 and point2 are
  referencing the exact same point object in memory
*/
        byte x=1;
        byte y=x;
        x=2;
        System.out.println(y);//1

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x=4;
        System.out.println(point2);//java.awt.Point[x=4,y=1]

/*
 String
   String message = new String("Hello World!");
   strings are referenced types in java but because
   we use them often there is a short way to create them.

   Because String it has members that can be accessed
   using '.' operator.
*/
        String message="Hello world";//short hand
        System.out.println(message);//Hello world
        String msg="Hello World!"+"!!";
        System.out.println(msg);//Hello World!!! (string concatenation)
        System.out.println(msg.endsWith("!"));//true
        System.out.println(msg.length());//14
        System.out.println(msg.indexOf("e"));//1
        System.out.println(msg.indexOf("sky"));//-1
        System.out.println(msg.replace("!","*"));//Hello World***
        System.out.println(msg);//Hello World!!! (strings are immutable)

        System.out.println("Hello \"Atul\"");//Hello "Atul"(escape sequence)
    }
}