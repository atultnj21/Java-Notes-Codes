/*
Anatomy of Java Program:

The smallest Building block in java program is functions.
A function is a block of code that perform some task.
as a metaphor think of the buttons of your remote of your TV
each button performs a task ,functions in programming language
does the same

how to code function in java :

ReturnType Name(){
    ...
}

some functions return something others don't
so the return_type of those functions are void.

Every java Program should have at-least 1 function that function
is called main().
so, Main() is the entry point to our programs.

these function don't exist on their own they belong to a class
Class is a container for related functions

Every java Program should have at-least 1 class that contains
main() function.

When  a function belong to a class we refer to it
as a method of that class.

In java all these classes and methods should have an access
modifiers,an access modifier is a special keyword that determine
if other classes and methods in this program can access these
classes and methods.

classes-PascalNamingConvention
methods-camelCaseNamingConvention

How java code Gets Executed

There are basically 2 steps Involved here
-compilation
-Execution

* compilation *
source code -> java compiler -> byte code
java byte code is platform independent

* execution *
byte code -> java virtual machine(jvm) -> native code

*/
//First Java program(Hello World!)
package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
