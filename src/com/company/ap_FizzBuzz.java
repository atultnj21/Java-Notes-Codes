
package com.company;
import java.util.Scanner;
public class ap_FizzBuzz {
    public static void main(String[] args) {
/*
write a program that behaves like this.
Here we should enter a number, if this number is divisible by
5, we get fizz, so if we run the program again and enter 10,
once again it's fizz. Now, if this number is divisible by 3,
we get buzz, if this number is divisible by both 5 and 3,
like 15, or 30, or whatever, we get fizz buzz and if this
number is not divisible by 5 or 3, like 2, we get the same
number printed on the terminal.
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int Number = sc.nextInt();
        /*
        if(Number%5==0){
            System.out.println("Fizz");
        }
        else if(Number%3==0){
            System.out.println("Buzz");
        }
        else if(Number%5==0 && Number%3==0){
            System.out.println("Fizz Buzz");
        }
        else{
            System.out.println(Number);
        }
         */

/*
this program has a bug if we enter a number that is
divisible by both 5 and 3, like 15. We get fizz again
So in situations like this, you should have the most
specific conditions on the top
*/
        /*
        if(Number%5==0 && Number%3==0){
            System.out.println("Fizz Buzz");
        }else if(Number%5==0){
            System.out.println("Fizz");
        }else if(Number%3==0){
            System.out.println("Buzz");
        } else{
            System.out.println(Number);
        }
         */

        if(Number%5==0){
            if(Number%3==0){
                System.out.println("Fizz Buzz");
            }else{
                System.out.println("Fizz");
            }
        }else if(Number%3==0){
            System.out.println("Buzz");
        }else{
            System.out.println(Number);
        }
    }
}
