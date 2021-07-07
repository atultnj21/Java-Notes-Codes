package com.company;

import java.util.Scanner;

public class ak_IfStatements {
    public static void main(String[] args) {
/*
If statements are extremely important, because
they allow us to make decisions based on certain
conditions.
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("temperature: ");
        int temperature=sc.nextInt();

        if(temperature>30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }else if(temperature>20 && temperature<=30){
            System.out.println("Beautiful day");
        }else{
            System.out.println("Cold day");
        }
    }
}
