/* Polymorphism means "many forms", and it occurs when
   we have many classes that are related to each other
   by inheritance.

 Inheritance lets us inherit attributes and methods
 from another class. Polymorphism uses those methods
 to perform different tasks.

 https://www.w3schools.com/java/java_polymorphism.asp */

package com.company;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: Meow Meow");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class bp_Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new cat();  // Create a cat object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
