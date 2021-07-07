package com.javaExceptions;

public class bMultipleException {
    public static void main(String[] args) {
        try{
            int arr[]=new int[7];
            arr[10]=10/5;
            System.out.println("Last Statement of try block");
        }
        catch(Exception e){
            System.out.println("Some Other Exception");
        }
//        catch(ArithmeticException e){
//            System.out.println("You should not divide a number by zero");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Accessing array elements outside of the limit");
//        }
//        System.out.println("Out of the try-catch block");
    }
}
/*
Compile time error: Exception in thread "main" java.lang.Error:
Unresolved compilation problems: Unreachable catch block for ArithmeticException.
It is already handled by the catch block for Exception Unreachable catch block
for ArrayIndexOutOfBoundsException. It is already handled by the catch block for
Exception at Example.main(Example1.java:11)
 */
