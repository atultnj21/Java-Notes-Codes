/*
https://www.w3schools.com/java/java_abstract.asp

Abstract class: is a restricted class that cannot be used
to create objects (to access it, it must be inherited from
another class).

Abstract method: can only be used in an abstract class, and
it does not have a body. The body is provided by the subclass
(inherited from).
 */

package com.company;

// Abstract class
abstract class aAnimal {

    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep()  {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class aCat extends aAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: Meow Meow");
    }
}



public class bq_AbstractClasses {
    public static void main(String[] args) {
        //Animal myObj = new Animal();  will generate an error

        aCat myCat = new aCat(); // Create a Cat object
        myCat.animalSound();// "The cat says: Meow Meow"
        myCat.sleep();// "Zzz"
    }
}
