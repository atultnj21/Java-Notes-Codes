package com.javaExceptions;

public class ThrowException {
    public static void main(String[] args) {
        int balance=50_000;
        int withdrawAmount=90_000;
        try{
            if(balance < withdrawAmount){
                throw new ArithmeticException("Insufficient Balance");
            }
            else{
                balance=balance-withdrawAmount;
                System.out.println("transaction completed");
                System.out.println("Balance: "+balance);
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program continue...");
    }
}
/*
Insufficient Balance
Program continue...
*/