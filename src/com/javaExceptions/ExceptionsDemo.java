package com.javaExceptions;

import java.util.Locale;

public class ExceptionsDemo {

//made it static so that we can easily call it from main
    public static void show(){
        sayHello(null);
    }

    public static void sayHello(String name){
        System.out.println("Hello "+ name.toUpperCase());
    }

}
/*
OUTPUT-
Exception in thread "main" java.lang.NullPointerException: Cannot invoke
   "String.toUpperCase()" because "name" is null
	at com.javaExceptions.ExceptionsDemo.sayHello(ExceptionsDemo.java:13)
	at com.javaExceptions.ExceptionsDemo.show(ExceptionsDemo.java:9)
	at com.javaExceptions.Main.main(Main.java:5)
*/

