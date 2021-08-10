package com.company;

import java.util.Scanner;

public class ajb_ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        var result = reverseANumber(num);
        System.out.println(result);
    }
    public static int reverseANumber(int num){
        int reverse=0;
        while(num!=0){
            int remainder= num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        return reverse;
    }
}
