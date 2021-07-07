/* Every class we declare directly or in directly
   inherits from the object class we didn't explicitly
   type objects java compiler automatically adds this
    for us that is why every class we declare
    has some additional Methods
    we have getClass() for reading meta data of object
    equals() comparing objects
    hashCode() returns integer based on address of object
    toString() returns string representation
    etc.*/

package com.company;

public class bm_TheObjectClass {
    public static void main(String[] args) {
        var box1= new aTextBox();
        System.out.println(box1.hashCode());//1452126962
        var box2 =box1;
        System.out.println(box1.equals(box2));//true
    }
}
