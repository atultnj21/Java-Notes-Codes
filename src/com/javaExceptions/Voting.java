/* CUSTOM EXCEPTION */
//Checked -> Exception
//Unchecked ->RuntimeException
package com.javaExceptions;

class UnderAgeException extends Exception{
    public UnderAgeException(){
        super("You are Under Age");
    }
    public UnderAgeException(String message){
        super(message);
    }
}
public class Voting {
//    either try catch or throws keyword
    public static void main(String[] args) {
        int age=17;

        try {
            if (age < 18) {
                throw new UnderAgeException("you are not 18 yet");
            }
        }catch (UnderAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
