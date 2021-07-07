/* https://beginnersbook.com/2013/05/catch-multiple-exceptions/ */
package com.javaExceptions;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int arr[]= new int[7];
            arr[4]=30/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Some other exception");
        }
        System.out.println("out-of try-catch");
    }
}
/*
OUTPUT:-
/ by zero
out-of try-catch
*/
