/* Loops */

/*
There are times where you want to repeat one or more statements.
we have loops in java for doing this

in situations where you know what how many times do you want
to execute one or more statements, it's better to use a for
loop. While loops are better where we don't know exactly how
many times we want to repeat something.

do-while loop is very similar to a while loop, but it gets
executed at least once
*/

package com.company;
import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;
public class aq_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for-loop
        for(int i=0;i<5;i++)
            System.out.println("Hello World " + i);

        /*
        while loop

        String input="";
        while(!input.equals("quit")){
            System.out.println("Input: ");
            input=sc.nextLine().toLowerCase().trim();
            System.out.println(input);
        }
        */

        String input="";
        do{
            System.out.println("Do-while loop");
            System.out.println("Input: ");
            input=sc.nextLine().toLowerCase().trim();
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }while(!input.equals("quit"));

/*
For-Each Loop
We use for each loops to iterate over arrays or collections
*/
            String[] fruits ={"Apple","mango","orange"};

            for(String fruit : fruits)
                System.out.println(fruit);
    }
}
