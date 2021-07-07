/* Clean Coding */
package com.company;
public class as_Methods_CleanCoding {
    public static void main(String[] args) {
/*
"Any fool can write code that computers can understand.
Good programmers write code that humans can understand."
*/
        greetUser("Atul","Taneja");
        String message=newMessage(20);
        System.out.println(message);
        //Hello, this is our code number 20
    }
    public static void greetUser(String firstName,String lastName){
        System.out.println("Hello "+ firstName + " " + lastName);
        //Hello Atul Taneja
    }
    public static String newMessage(int code){
        return "Hello, this is our code number " + code;
    }
}
