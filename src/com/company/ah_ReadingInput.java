/* Reading Input*/
package com.company;

import java.util.Scanner;

public class ah_ReadingInput {
    public static void main(String[] args) {
/*
In Java we have this scanner class that is defined
in Java.Util package. let's import this and create
scanner object.So new scanner. Now here inside
these parenthesis, we need to specify where we're
going to read data from, are we going to read it
from the terminal window, are we going to read it
from the file or what?

this object has a bunch of methods for reading data,
and all these methods start with next

*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        byte age=sc.nextByte();
        System.out.println("You are " + age);//You are 20

/*
Why string inputs after integer input gets skipped in Java?

nextInt() : reads int value and cursor remains just after
the integer.
nextLine():reads string  and cursor skips to the newline

when we issue the next line command just after integer the cursor
starts finding input on the same line which is empty
so its prints an empty string and then goes to next line
*/
        sc.nextLine();// skip to newline (solution)

        //String name =sc.next(); for single word/token
        System.out.println("Name: ");
        String name=sc.nextLine();
        System.out.println(name);//Atul Taneja

    }
}
