/* Overriding :
   is a  feature that allows a subclass or child
   class to provide a specific implementation
   of a method that is already provided by one of its
   superclasses or parent classes.

   https://www.javatpoint.com/method-overriding-in-java */

package com.company;

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    // it helps the java compiler to double check the code for correctness
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class bo_OverridingMethods {
    public static void main(String[] args) {

        Bike bike = new Bike();
//        Vehicle bike = new Bike();
        bike.run();// "Bike is running safely"
    }
}
