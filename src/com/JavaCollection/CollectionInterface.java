/* Collection interface
   Add
   Remove
   Check for existance */
package com.JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

class CollectionsDemo{
    public static void show(){

        //Because ArrayList implements Collection
        Collection<String> group = new ArrayList<>();

        //add Method
        group.add("a");
        group.add("b");
        group.add("c");
        for(String item: group)
            System.out.println(item);

        //Print group as a whole
        System.out.println(group);//[a,b,c]

        //add multiple items in one go
        //Collections class is a utility class in java.util package
        Collections.addAll(group,"d","e","f");//[a, b, c, d, e, f]
        System.out.println(group);

        // size of a collection
        System.out.println(group.size());//6

        // remove method
        //we can also remove all items by calling clear method ,can verify by calling isEmpty()
        group.remove("c");
        System.out.println(group);//[a, b, d, e, f]

        // Contains Method
        System.out.println(group.contains("c"));//false

        //Convert collection to regular Array
        Object[] objectArray=group.toArray();
        // objectArray. -> we will not see any of the String methods

        // Convert to String Array instead of object Array
        String[] stringArray = group.toArray(new String[0]);
        stringArray[0].toUpperCase();

        // Compare Two Collection For Equality
        Collection<String> other = new ArrayList<>();
        other.addAll(group);
        System.out.println(other);//[a, b, d, e, f]

        //we will et false because we have two different objects in memory
        System.out.println(group==other);

        //use the equals method for this
        System.out.println(group.equals(other));//true
    }
}
public class CollectionInterface{
    public static void main(String[] args) {
        CollectionsDemo.show();
    }
}
